package com.tbsoo.xtpay.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Agent {
    private Integer id;
    private String agentNo;
    private String agentPassword;
    private String agentName;
    private Integer parentAgentId;
    private String areaCode;
    private String proposer;
    private String contactPhone;
    private String address;
    private String postcode;
    private String businessRegistrationName;
    private String organizationCode;
    private String businessLicenseNo;
    private String taxRegistrationNo;
    private String businessScope;
    private BigDecimal registeredCapital;
    private String masterAccountBank;
    private String masterAccountBankName;
    private String masterAccountName;
    private String masterAccountNo;
    private String corporationName;
    private String corporationIdentityCard;
    private String corporationPhone;
    private BigDecimal wechatScanRate;
    private BigDecimal alipaySacnRate;
    private BigDecimal alipayServiceRate;
    private BigDecimal wechatPublicRate;
    private BigDecimal qqRate;
    private BigDecimal gatewayRate;
    private BigDecimal quickRate;
    private BigDecimal wapRate;
    private String businessContact;
    private String businessContactPhone;
    private String businessContactQq;
    private String businessContactEmail;
    private String fax;
    private Long applyTime;
    private Integer status;
    private Long createTime;
    private Integer operatorId;
    private String operatorName;

}