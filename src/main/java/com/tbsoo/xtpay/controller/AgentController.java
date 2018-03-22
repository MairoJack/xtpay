package com.tbsoo.xtpay.controller;

import com.alibaba.fastjson.JSON;
import com.tbsoo.xtpay.model.Result;
import com.tbsoo.xtpay.service.AgentService;
import com.tbsoo.xtpay.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 代理商控制器
 */
@RestController
@RequestMapping("/agent")
public class AgentController extends BaseController{

    @Autowired
    private AgentService agentService;

    @GetMapping("/info")
    @ResponseBody
    public Result getAgent() {
        return ResultUtil.success(agentService.getAgent(Integer.valueOf(getUserId())));
    }

    @GetMapping("/list")
    @ResponseBody
    public Result list(){
        return ResultUtil.success(agentService.list());
    }

}
