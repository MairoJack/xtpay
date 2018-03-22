package com.tbsoo.xtpay.model;

public class FinancingWithBLOBs extends Financing {
    private String intro;

    private String guarantorsAdvice;

    private String riskControl;

    private String material;

    private String repaymentRemark;

    private String month;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getGuarantorsAdvice() {
        return guarantorsAdvice;
    }

    public void setGuarantorsAdvice(String guarantorsAdvice) {
        this.guarantorsAdvice = guarantorsAdvice == null ? null : guarantorsAdvice.trim();
    }

    public String getRiskControl() {
        return riskControl;
    }

    public void setRiskControl(String riskControl) {
        this.riskControl = riskControl == null ? null : riskControl.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getRepaymentRemark() {
        return repaymentRemark;
    }

    public void setRepaymentRemark(String repaymentRemark) {
        this.repaymentRemark = repaymentRemark == null ? null : repaymentRemark.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }
}