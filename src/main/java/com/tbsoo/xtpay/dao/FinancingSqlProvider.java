package com.tbsoo.xtpay.dao;

import com.tbsoo.xtpay.model.FinancingWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class FinancingSqlProvider {

    public String insertSelective(FinancingWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hc_financing");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getProductNo() != null) {
            sql.VALUES("product_no", "#{productNo,jdbcType=VARCHAR}");
        }
        
        if (record.getContractNo() != null) {
            sql.VALUES("contract_no", "#{contractNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBorrowReason() != null) {
            sql.VALUES("borrow_reason", "#{borrowReason,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.VALUES("category", "#{category,jdbcType=BIT}");
        }
        
        if (record.getBorrowerId() != null) {
            sql.VALUES("borrower_id", "#{borrowerId,jdbcType=INTEGER}");
        }
        
        if (record.getBorrowerName() != null) {
            sql.VALUES("borrower_name", "#{borrowerName,jdbcType=VARCHAR}");
        }
        
        if (record.getNature() != null) {
            sql.VALUES("nature", "#{nature,jdbcType=BIT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=BIT}");
        }
        
        if (record.getRepayment() != null) {
            sql.VALUES("repayment", "#{repayment,jdbcType=BIT}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("operator", "#{operator,jdbcType=INTEGER}");
        }
        
        if (record.getJoinDate() != null) {
            sql.VALUES("join_date", "#{joinDate,jdbcType=INTEGER}");
        }
        
        if (record.getPubDate() != null) {
            sql.VALUES("pub_date", "#{pubDate,jdbcType=INTEGER}");
        }
        
        if (record.getValueDate() != null) {
            sql.VALUES("value_date", "#{valueDate,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getThresholdAmount() != null) {
            sql.VALUES("threshold_amount", "#{thresholdAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIncreasingAmount() != null) {
            sql.VALUES("increasing_amount", "#{increasingAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxAmount() != null) {
            sql.VALUES("max_amount", "#{maxAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRaiseDate() != null) {
            sql.VALUES("raise_date", "#{raiseDate,jdbcType=INTEGER}");
        }
        
        if (record.getDeadline() != null) {
            sql.VALUES("deadline", "#{deadline,jdbcType=INTEGER}");
        }
        
        if (record.getRepaymentDate() != null) {
            sql.VALUES("repayment_date", "#{repaymentDate,jdbcType=INTEGER}");
        }
        
        if (record.getGuarantorsId() != null) {
            sql.VALUES("guarantors_id", "#{guarantorsId,jdbcType=INTEGER}");
        }
        
        if (record.getGuarantorsName() != null) {
            sql.VALUES("guarantors_name", "#{guarantorsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuaranteedAmount() != null) {
            sql.VALUES("guaranteed_amount", "#{guaranteedAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getYearIncome() != null) {
            sql.VALUES("year_income", "#{yearIncome,jdbcType=DECIMAL}");
        }
        
        if (record.getExtraYearIncome() != null) {
            sql.VALUES("extra_year_income", "#{extraYearIncome,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=BIT}");
        }
        
        if (record.getIsApprove() != null) {
            sql.VALUES("is_approve", "#{isApprove,jdbcType=BIT}");
        }
        
        if (record.getAuditAdvice() != null) {
            sql.VALUES("audit_advice", "#{auditAdvice,jdbcType=VARCHAR}");
        }
        
        if (record.getConftime() != null) {
            sql.VALUES("conftime", "#{conftime,jdbcType=INTEGER}");
        }
        
        if (record.getFee() != null) {
            sql.VALUES("fee", "#{fee,jdbcType=DECIMAL}");
        }
        
        if (record.getFullScaleDate() != null) {
            sql.VALUES("full_scale_date", "#{fullScaleDate,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentAmount() != null) {
            sql.VALUES("payment_amount", "#{paymentAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getPaymentDate() != null) {
            sql.VALUES("payment_date", "#{paymentDate,jdbcType=INTEGER}");
        }
        
        if (record.getIsRetrial() != null) {
            sql.VALUES("is_retrial", "#{isRetrial,jdbcType=BIT}");
        }
        
        if (record.getRetrialAdvice() != null) {
            sql.VALUES("retrial_advice", "#{retrialAdvice,jdbcType=VARCHAR}");
        }
        
        if (record.getSecondConftime() != null) {
            sql.VALUES("second_conftime", "#{secondConftime,jdbcType=INTEGER}");
        }
        
        if (record.getTermTotal() != null) {
            sql.VALUES("term_total", "#{termTotal,jdbcType=INTEGER}");
        }
        
        if (record.getClickNum() != null) {
            sql.VALUES("click_num", "#{clickNum,jdbcType=INTEGER}");
        }
        
        if (record.getOvertime() != null) {
            sql.VALUES("overtime", "#{overtime,jdbcType=INTEGER}");
        }
        
        if (record.getSeries() != null) {
            sql.VALUES("series", "#{series,jdbcType=INTEGER}");
        }
        
        if (record.getTemplateId() != null) {
            sql.VALUES("template_id", "#{templateId,jdbcType=INTEGER}");
        }
        
        if (record.getProxyId() != null) {
            sql.VALUES("proxy_id", "#{proxyId,jdbcType=INTEGER}");
        }
        
        if (record.getIsPreviewRepayment() != null) {
            sql.VALUES("is_preview_repayment", "#{isPreviewRepayment,jdbcType=TINYINT}");
        }
        
        if (record.getPayInterestDay() != null) {
            sql.VALUES("pay_interest_day", "#{payInterestDay,jdbcType=INTEGER}");
        }
        
        if (record.getMinRepaymentDate() != null) {
            sql.VALUES("min_repayment_date", "#{minRepaymentDate,jdbcType=VARCHAR}");
        }
        
        if (record.getFinishPreviewRepayment() != null) {
            sql.VALUES("finish_preview_repayment", "#{finishPreviewRepayment,jdbcType=BIT}");
        }
        
        if (record.getPreviewRepaymentDate() != null) {
            sql.VALUES("preview_repayment_date", "#{previewRepaymentDate,jdbcType=INTEGER}");
        }
        
        if (record.getEstimateInterest() != null) {
            sql.VALUES("estimate_interest", "#{estimateInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getIsWelfare() != null) {
            sql.VALUES("is_welfare", "#{isWelfare,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getIntro() != null) {
            sql.VALUES("intro", "#{intro,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getGuarantorsAdvice() != null) {
            sql.VALUES("guarantors_advice", "#{guarantorsAdvice,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRiskControl() != null) {
            sql.VALUES("risk_control", "#{riskControl,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getMaterial() != null) {
            sql.VALUES("material", "#{material,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRepaymentRemark() != null) {
            sql.VALUES("repayment_remark", "#{repaymentRemark,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getMonth() != null) {
            sql.VALUES("month", "#{month,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FinancingWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("hc_financing");
        
        if (record.getProductNo() != null) {
            sql.SET("product_no = #{productNo,jdbcType=VARCHAR}");
        }
        
        if (record.getContractNo() != null) {
            sql.SET("contract_no = #{contractNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBorrowReason() != null) {
            sql.SET("borrow_reason = #{borrowReason,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{category,jdbcType=BIT}");
        }
        
        if (record.getBorrowerId() != null) {
            sql.SET("borrower_id = #{borrowerId,jdbcType=INTEGER}");
        }
        
        if (record.getBorrowerName() != null) {
            sql.SET("borrower_name = #{borrowerName,jdbcType=VARCHAR}");
        }
        
        if (record.getNature() != null) {
            sql.SET("nature = #{nature,jdbcType=BIT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=BIT}");
        }
        
        if (record.getRepayment() != null) {
            sql.SET("repayment = #{repayment,jdbcType=BIT}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=INTEGER}");
        }
        
        if (record.getJoinDate() != null) {
            sql.SET("join_date = #{joinDate,jdbcType=INTEGER}");
        }
        
        if (record.getPubDate() != null) {
            sql.SET("pub_date = #{pubDate,jdbcType=INTEGER}");
        }
        
        if (record.getValueDate() != null) {
            sql.SET("value_date = #{valueDate,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getThresholdAmount() != null) {
            sql.SET("threshold_amount = #{thresholdAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIncreasingAmount() != null) {
            sql.SET("increasing_amount = #{increasingAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxAmount() != null) {
            sql.SET("max_amount = #{maxAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRaiseDate() != null) {
            sql.SET("raise_date = #{raiseDate,jdbcType=INTEGER}");
        }
        
        if (record.getDeadline() != null) {
            sql.SET("deadline = #{deadline,jdbcType=INTEGER}");
        }
        
        if (record.getRepaymentDate() != null) {
            sql.SET("repayment_date = #{repaymentDate,jdbcType=INTEGER}");
        }
        
        if (record.getGuarantorsId() != null) {
            sql.SET("guarantors_id = #{guarantorsId,jdbcType=INTEGER}");
        }
        
        if (record.getGuarantorsName() != null) {
            sql.SET("guarantors_name = #{guarantorsName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuaranteedAmount() != null) {
            sql.SET("guaranteed_amount = #{guaranteedAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getYearIncome() != null) {
            sql.SET("year_income = #{yearIncome,jdbcType=DECIMAL}");
        }
        
        if (record.getExtraYearIncome() != null) {
            sql.SET("extra_year_income = #{extraYearIncome,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=BIT}");
        }
        
        if (record.getIsApprove() != null) {
            sql.SET("is_approve = #{isApprove,jdbcType=BIT}");
        }
        
        if (record.getAuditAdvice() != null) {
            sql.SET("audit_advice = #{auditAdvice,jdbcType=VARCHAR}");
        }
        
        if (record.getConftime() != null) {
            sql.SET("conftime = #{conftime,jdbcType=INTEGER}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{fee,jdbcType=DECIMAL}");
        }
        
        if (record.getFullScaleDate() != null) {
            sql.SET("full_scale_date = #{fullScaleDate,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentAmount() != null) {
            sql.SET("payment_amount = #{paymentAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getPaymentDate() != null) {
            sql.SET("payment_date = #{paymentDate,jdbcType=INTEGER}");
        }
        
        if (record.getIsRetrial() != null) {
            sql.SET("is_retrial = #{isRetrial,jdbcType=BIT}");
        }
        
        if (record.getRetrialAdvice() != null) {
            sql.SET("retrial_advice = #{retrialAdvice,jdbcType=VARCHAR}");
        }
        
        if (record.getSecondConftime() != null) {
            sql.SET("second_conftime = #{secondConftime,jdbcType=INTEGER}");
        }
        
        if (record.getTermTotal() != null) {
            sql.SET("term_total = #{termTotal,jdbcType=INTEGER}");
        }
        
        if (record.getClickNum() != null) {
            sql.SET("click_num = #{clickNum,jdbcType=INTEGER}");
        }
        
        if (record.getOvertime() != null) {
            sql.SET("overtime = #{overtime,jdbcType=INTEGER}");
        }
        
        if (record.getSeries() != null) {
            sql.SET("series = #{series,jdbcType=INTEGER}");
        }
        
        if (record.getTemplateId() != null) {
            sql.SET("template_id = #{templateId,jdbcType=INTEGER}");
        }
        
        if (record.getProxyId() != null) {
            sql.SET("proxy_id = #{proxyId,jdbcType=INTEGER}");
        }
        
        if (record.getIsPreviewRepayment() != null) {
            sql.SET("is_preview_repayment = #{isPreviewRepayment,jdbcType=TINYINT}");
        }
        
        if (record.getPayInterestDay() != null) {
            sql.SET("pay_interest_day = #{payInterestDay,jdbcType=INTEGER}");
        }
        
        if (record.getMinRepaymentDate() != null) {
            sql.SET("min_repayment_date = #{minRepaymentDate,jdbcType=VARCHAR}");
        }
        
        if (record.getFinishPreviewRepayment() != null) {
            sql.SET("finish_preview_repayment = #{finishPreviewRepayment,jdbcType=BIT}");
        }
        
        if (record.getPreviewRepaymentDate() != null) {
            sql.SET("preview_repayment_date = #{previewRepaymentDate,jdbcType=INTEGER}");
        }
        
        if (record.getEstimateInterest() != null) {
            sql.SET("estimate_interest = #{estimateInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getIsWelfare() != null) {
            sql.SET("is_welfare = #{isWelfare,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getIntro() != null) {
            sql.SET("intro = #{intro,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getGuarantorsAdvice() != null) {
            sql.SET("guarantors_advice = #{guarantorsAdvice,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRiskControl() != null) {
            sql.SET("risk_control = #{riskControl,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getMaterial() != null) {
            sql.SET("material = #{material,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRepaymentRemark() != null) {
            sql.SET("repayment_remark = #{repaymentRemark,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getMonth() != null) {
            sql.SET("month = #{month,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}