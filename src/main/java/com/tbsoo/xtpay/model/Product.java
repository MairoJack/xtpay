package com.tbsoo.xtpay.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private Integer id;

    private String productNo;

    private String contractNo;

    private String borrowReason;

    private String name;

    private Boolean isWelfare;

    private Boolean category;

    private Integer borrowerId;

    private String borrowerName;

    private Boolean nature;

    private Boolean type;

    private Boolean repayment;

    private Integer operator;

    private Integer joinDate;

    private Integer pubDate;

    private Integer valueDate;

    private BigDecimal amount;

    private BigDecimal sellAmount;

    private BigDecimal thresholdAmount;

    private BigDecimal increasingAmount;

    private BigDecimal maxAmount;

    private Integer raiseDate;

    private Integer deadline;

    private Integer repaymentDate;

    private Integer guarantorsId;

    private String guarantorsName;

    private BigDecimal guaranteedAmount;

    private BigDecimal yearIncome;

    private BigDecimal extraYearIncome;

    private Boolean status;

    private Boolean isApprove;

    private String auditAdvice;

    private Integer conftime;

    private BigDecimal fee;

    private Integer fullScaleDate;

    private BigDecimal paymentAmount;

    private Integer paymentDate;

    private Boolean isRetrial;

    private String retrialAdvice;

    private Integer secondConftime;

    private Integer termTotal;

    private Integer clickNum;

    private Integer overtime;

    private Integer series;

    private Integer templateId;

    private Integer proxyId;

    private Byte isPreviewRepayment;

    private Integer payInterestDay;

    private String minRepaymentDate;

    private Boolean finishPreviewRepayment;

    private Integer previewRepaymentDate;

    private BigDecimal estimateInterest;

    private String remark;
}