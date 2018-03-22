package com.tbsoo.xtpay.exception;

public enum ErrorCode {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    LOGOUT_FAIL(1001, "登出失败")
    ;

    private Integer code;
    private String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
