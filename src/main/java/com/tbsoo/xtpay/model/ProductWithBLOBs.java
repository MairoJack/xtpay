package com.tbsoo.xtpay.model;

import lombok.Data;

@Data
public class ProductWithBLOBs extends Product {
    private String intro;

    private String guarantorsAdvice;

    private String riskControl;

    private String material;

    private String repaymentRemark;

    private String month;
}