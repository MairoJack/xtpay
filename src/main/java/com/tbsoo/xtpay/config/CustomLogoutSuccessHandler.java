package com.tbsoo.xtpay.config;

import com.alibaba.fastjson.JSON;
import com.tbsoo.xtpay.common.Constant;
import com.tbsoo.xtpay.exception.BusinessException;
import com.tbsoo.xtpay.exception.ErrorCode;
import com.tbsoo.xtpay.model.Result;
import com.tbsoo.xtpay.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Component
public class CustomLogoutSuccessHandler extends AbstractAuthenticationTargetUrlRequestHandler implements LogoutSuccessHandler{

    @Autowired
    private RedisTokenStore redisTokenStore;
    private boolean success = false;
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        String token = httpServletRequest.getHeader(Constant.HEADER_AUTHORIZATION);

        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        httpServletResponse.setContentType("application/json; charset=utf-8");
        httpServletResponse.setCharacterEncoding("UTF-8");

        if (token != null && token.startsWith(Constant.BEARER_AUTHENTICATION)) {

            OAuth2AccessToken oAuth2AccessToken = redisTokenStore.readAccessToken(token.split(" ")[1]);
            if (oAuth2AccessToken != null) {
                redisTokenStore.removeAccessToken(oAuth2AccessToken);
                success = true;
            }
        }
        if(success){
            Result result = ResultUtil.success("登出成功");
            OutputStream out = httpServletResponse.getOutputStream();
            out.write(JSON.toJSONString(result).getBytes("UTF-8"));
            out.flush();
        } else {
            throw new BusinessException(ErrorCode.LOGOUT_FAIL);
        }


    }
}
