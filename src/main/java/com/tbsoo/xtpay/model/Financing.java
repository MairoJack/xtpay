package com.tbsoo.xtpay.model;

import java.math.BigDecimal;

public class Financing {
    private Integer id;

    private String productNo;

    private String contractNo;

    private String borrowReason;

    private String name;

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

    private Boolean isWelfare;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getBorrowReason() {
        return borrowReason;
    }

    public void setBorrowReason(String borrowReason) {
        this.borrowReason = borrowReason == null ? null : borrowReason.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName == null ? null : borrowerName.trim();
    }

    public Boolean getNature() {
        return nature;
    }

    public void setNature(Boolean nature) {
        this.nature = nature;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getRepayment() {
        return repayment;
    }

    public void setRepayment(Boolean repayment) {
        this.repayment = repayment;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Integer getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Integer joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getPubDate() {
        return pubDate;
    }

    public void setPubDate(Integer pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getValueDate() {
        return valueDate;
    }

    public void setValueDate(Integer valueDate) {
        this.valueDate = valueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public BigDecimal getIncreasingAmount() {
        return increasingAmount;
    }

    public void setIncreasingAmount(BigDecimal increasingAmount) {
        this.increasingAmount = increasingAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getRaiseDate() {
        return raiseDate;
    }

    public void setRaiseDate(Integer raiseDate) {
        this.raiseDate = raiseDate;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Integer getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Integer repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getGuarantorsId() {
        return guarantorsId;
    }

    public void setGuarantorsId(Integer guarantorsId) {
        this.guarantorsId = guarantorsId;
    }

    public String getGuarantorsName() {
        return guarantorsName;
    }

    public void setGuarantorsName(String guarantorsName) {
        this.guarantorsName = guarantorsName == null ? null : guarantorsName.trim();
    }

    public BigDecimal getGuaranteedAmount() {
        return guaranteedAmount;
    }

    public void setGuaranteedAmount(BigDecimal guaranteedAmount) {
        this.guaranteedAmount = guaranteedAmount;
    }

    public BigDecimal getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(BigDecimal yearIncome) {
        this.yearIncome = yearIncome;
    }

    public BigDecimal getExtraYearIncome() {
        return extraYearIncome;
    }

    public void setExtraYearIncome(BigDecimal extraYearIncome) {
        this.extraYearIncome = extraYearIncome;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(Boolean isApprove) {
        this.isApprove = isApprove;
    }

    public String getAuditAdvice() {
        return auditAdvice;
    }

    public void setAuditAdvice(String auditAdvice) {
        this.auditAdvice = auditAdvice == null ? null : auditAdvice.trim();
    }

    public Integer getConftime() {
        return conftime;
    }

    public void setConftime(Integer conftime) {
        this.conftime = conftime;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getFullScaleDate() {
        return fullScaleDate;
    }

    public void setFullScaleDate(Integer fullScaleDate) {
        this.fullScaleDate = fullScaleDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Integer paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Boolean getIsRetrial() {
        return isRetrial;
    }

    public void setIsRetrial(Boolean isRetrial) {
        this.isRetrial = isRetrial;
    }

    public String getRetrialAdvice() {
        return retrialAdvice;
    }

    public void setRetrialAdvice(String retrialAdvice) {
        this.retrialAdvice = retrialAdvice == null ? null : retrialAdvice.trim();
    }

    public Integer getSecondConftime() {
        return secondConftime;
    }

    public void setSecondConftime(Integer secondConftime) {
        this.secondConftime = secondConftime;
    }

    public Integer getTermTotal() {
        return termTotal;
    }

    public void setTermTotal(Integer termTotal) {
        this.termTotal = termTotal;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getProxyId() {
        return proxyId;
    }

    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }

    public Byte getIsPreviewRepayment() {
        return isPreviewRepayment;
    }

    public void setIsPreviewRepayment(Byte isPreviewRepayment) {
        this.isPreviewRepayment = isPreviewRepayment;
    }

    public Integer getPayInterestDay() {
        return payInterestDay;
    }

    public void setPayInterestDay(Integer payInterestDay) {
        this.payInterestDay = payInterestDay;
    }

    public String getMinRepaymentDate() {
        return minRepaymentDate;
    }

    public void setMinRepaymentDate(String minRepaymentDate) {
        this.minRepaymentDate = minRepaymentDate == null ? null : minRepaymentDate.trim();
    }

    public Boolean getFinishPreviewRepayment() {
        return finishPreviewRepayment;
    }

    public void setFinishPreviewRepayment(Boolean finishPreviewRepayment) {
        this.finishPreviewRepayment = finishPreviewRepayment;
    }

    public Integer getPreviewRepaymentDate() {
        return previewRepaymentDate;
    }

    public void setPreviewRepaymentDate(Integer previewRepaymentDate) {
        this.previewRepaymentDate = previewRepaymentDate;
    }

    public BigDecimal getEstimateInterest() {
        return estimateInterest;
    }

    public void setEstimateInterest(BigDecimal estimateInterest) {
        this.estimateInterest = estimateInterest;
    }

    public Boolean getIsWelfare() {
        return isWelfare;
    }

    public void setIsWelfare(Boolean isWelfare) {
        this.isWelfare = isWelfare;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}