package com.tbsoo.xtpay.model;

import lombok.Data;

@Data
public class Result {
    private int status = 0;
    private String message;
    private Object data;
}
