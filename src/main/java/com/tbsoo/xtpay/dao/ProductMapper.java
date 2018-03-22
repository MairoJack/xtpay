package com.tbsoo.xtpay.dao;

import com.tbsoo.xtpay.model.Product;
import com.tbsoo.xtpay.model.ProductWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productMapper")
public interface ProductMapper {
    @Delete({
        "delete from hc_product",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hc_product (id, product_no, ",
        "contract_no, borrow_reason, ",
        "name, is_welfare, category, ",
        "borrower_id, borrower_name, ",
        "nature, type, repayment, ",
        "operator, join_date, ",
        "pub_date, value_date, ",
        "amount, sell_amount, ",
        "threshold_amount, increasing_amount, ",
        "max_amount, raise_date, ",
        "deadline, repayment_date, ",
        "guarantors_id, guarantors_name, ",
        "guaranteed_amount, year_income, ",
        "extra_year_income, status, ",
        "is_approve, audit_advice, ",
        "conftime, fee, full_scale_date, ",
        "payment_amount, payment_date, ",
        "is_retrial, retrial_advice, ",
        "second_conftime, term_total, ",
        "click_num, overtime, ",
        "series, template_id, ",
        "proxy_id, is_preview_repayment, ",
        "pay_interest_day, min_repayment_date, ",
        "finish_preview_repayment, preview_repayment_date, ",
        "estimate_interest, intro, ",
        "guarantors_advice, risk_control, ",
        "material, repayment_remark, ",
        "month)",
        "values (#{id,jdbcType=INTEGER}, #{productNo,jdbcType=VARCHAR}, ",
        "#{contractNo,jdbcType=VARCHAR}, #{borrowReason,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{isWelfare,jdbcType=BIT}, #{category,jdbcType=BIT}, ",
        "#{borrowerId,jdbcType=INTEGER}, #{borrowerName,jdbcType=VARCHAR}, ",
        "#{nature,jdbcType=BIT}, #{type,jdbcType=BIT}, #{repayment,jdbcType=BIT}, ",
        "#{operator,jdbcType=INTEGER}, #{joinDate,jdbcType=INTEGER}, ",
        "#{pubDate,jdbcType=INTEGER}, #{valueDate,jdbcType=INTEGER}, ",
        "#{amount,jdbcType=DECIMAL}, #{sellAmount,jdbcType=DECIMAL}, ",
        "#{thresholdAmount,jdbcType=DECIMAL}, #{increasingAmount,jdbcType=DECIMAL}, ",
        "#{maxAmount,jdbcType=DECIMAL}, #{raiseDate,jdbcType=INTEGER}, ",
        "#{deadline,jdbcType=INTEGER}, #{repaymentDate,jdbcType=INTEGER}, ",
        "#{guarantorsId,jdbcType=INTEGER}, #{guarantorsName,jdbcType=VARCHAR}, ",
        "#{guaranteedAmount,jdbcType=DECIMAL}, #{yearIncome,jdbcType=DECIMAL}, ",
        "#{extraYearIncome,jdbcType=DECIMAL}, #{status,jdbcType=BIT}, ",
        "#{isApprove,jdbcType=BIT}, #{auditAdvice,jdbcType=VARCHAR}, ",
        "#{conftime,jdbcType=INTEGER}, #{fee,jdbcType=DECIMAL}, #{fullScaleDate,jdbcType=INTEGER}, ",
        "#{paymentAmount,jdbcType=DECIMAL}, #{paymentDate,jdbcType=INTEGER}, ",
        "#{isRetrial,jdbcType=BIT}, #{retrialAdvice,jdbcType=VARCHAR}, ",
        "#{secondConftime,jdbcType=INTEGER}, #{termTotal,jdbcType=INTEGER}, ",
        "#{clickNum,jdbcType=INTEGER}, #{overtime,jdbcType=INTEGER}, ",
        "#{series,jdbcType=INTEGER}, #{templateId,jdbcType=INTEGER}, ",
        "#{proxyId,jdbcType=INTEGER}, #{isPreviewRepayment,jdbcType=TINYINT}, ",
        "#{payInterestDay,jdbcType=INTEGER}, #{minRepaymentDate,jdbcType=VARCHAR}, ",
        "#{finishPreviewRepayment,jdbcType=BIT}, #{previewRepaymentDate,jdbcType=INTEGER}, ",
        "#{estimateInterest,jdbcType=DECIMAL}, #{intro,jdbcType=LONGVARCHAR}, ",
        "#{guarantorsAdvice,jdbcType=LONGVARCHAR}, #{riskControl,jdbcType=LONGVARCHAR}, ",
        "#{material,jdbcType=LONGVARCHAR}, #{repaymentRemark,jdbcType=LONGVARCHAR}, ",
        "#{month,jdbcType=LONGVARCHAR})"
    })
    int insert(ProductWithBLOBs record);

    @InsertProvider(type=ProductSqlProvider.class, method="insertSelective")
    int insertSelective(ProductWithBLOBs record);

    @Select({
        "select",
        "id, product_no, contract_no, borrow_reason, name, is_welfare, category, borrower_id, ",
        "borrower_name, nature, type, repayment, operator, join_date, pub_date, value_date, ",
        "amount, sell_amount, threshold_amount, increasing_amount, max_amount, raise_date, ",
        "deadline, repayment_date, guarantors_id, guarantors_name, guaranteed_amount, ",
        "year_income, extra_year_income, status, is_approve, audit_advice, conftime, ",
        "fee, full_scale_date, payment_amount, payment_date, is_retrial, retrial_advice, ",
        "second_conftime, term_total, click_num, overtime, series, template_id, proxy_id, ",
        "is_preview_repayment, pay_interest_day, min_repayment_date, finish_preview_repayment, ",
        "preview_repayment_date, estimate_interest, intro, guarantors_advice, risk_control, ",
        "material, repayment_remark, month",
        "from hc_product",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="product_no", property="productNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_no", property="contractNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="borrow_reason", property="borrowReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_welfare", property="isWelfare", jdbcType=JdbcType.BIT),
        @Result(column="category", property="category", jdbcType=JdbcType.BIT),
        @Result(column="borrower_id", property="borrowerId", jdbcType=JdbcType.INTEGER),
        @Result(column="borrower_name", property="borrowerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nature", property="nature", jdbcType=JdbcType.BIT),
        @Result(column="type", property="type", jdbcType=JdbcType.BIT),
        @Result(column="repayment", property="repayment", jdbcType=JdbcType.BIT),
        @Result(column="operator", property="operator", jdbcType=JdbcType.INTEGER),
        @Result(column="join_date", property="joinDate", jdbcType=JdbcType.INTEGER),
        @Result(column="pub_date", property="pubDate", jdbcType=JdbcType.INTEGER),
        @Result(column="value_date", property="valueDate", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="sell_amount", property="sellAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="threshold_amount", property="thresholdAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="increasing_amount", property="increasingAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_amount", property="maxAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="raise_date", property="raiseDate", jdbcType=JdbcType.INTEGER),
        @Result(column="deadline", property="deadline", jdbcType=JdbcType.INTEGER),
        @Result(column="repayment_date", property="repaymentDate", jdbcType=JdbcType.INTEGER),
        @Result(column="guarantors_id", property="guarantorsId", jdbcType=JdbcType.INTEGER),
        @Result(column="guarantors_name", property="guarantorsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="guaranteed_amount", property="guaranteedAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="year_income", property="yearIncome", jdbcType=JdbcType.DECIMAL),
        @Result(column="extra_year_income", property="extraYearIncome", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.BIT),
        @Result(column="is_approve", property="isApprove", jdbcType=JdbcType.BIT),
        @Result(column="audit_advice", property="auditAdvice", jdbcType=JdbcType.VARCHAR),
        @Result(column="conftime", property="conftime", jdbcType=JdbcType.INTEGER),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="full_scale_date", property="fullScaleDate", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_amount", property="paymentAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="payment_date", property="paymentDate", jdbcType=JdbcType.INTEGER),
        @Result(column="is_retrial", property="isRetrial", jdbcType=JdbcType.BIT),
        @Result(column="retrial_advice", property="retrialAdvice", jdbcType=JdbcType.VARCHAR),
        @Result(column="second_conftime", property="secondConftime", jdbcType=JdbcType.INTEGER),
        @Result(column="term_total", property="termTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="click_num", property="clickNum", jdbcType=JdbcType.INTEGER),
        @Result(column="overtime", property="overtime", jdbcType=JdbcType.INTEGER),
        @Result(column="series", property="series", jdbcType=JdbcType.INTEGER),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.INTEGER),
        @Result(column="proxy_id", property="proxyId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_preview_repayment", property="isPreviewRepayment", jdbcType=JdbcType.TINYINT),
        @Result(column="pay_interest_day", property="payInterestDay", jdbcType=JdbcType.INTEGER),
        @Result(column="min_repayment_date", property="minRepaymentDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="finish_preview_repayment", property="finishPreviewRepayment", jdbcType=JdbcType.BIT),
        @Result(column="preview_repayment_date", property="previewRepaymentDate", jdbcType=JdbcType.INTEGER),
        @Result(column="estimate_interest", property="estimateInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="intro", property="intro", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="guarantors_advice", property="guarantorsAdvice", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="risk_control", property="riskControl", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="material", property="material", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="repayment_remark", property="repaymentRemark", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="month", property="month", jdbcType=JdbcType.LONGVARCHAR)
    })
    ProductWithBLOBs selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    @Update({
        "update hc_product",
        "set product_no = #{productNo,jdbcType=VARCHAR},",
          "contract_no = #{contractNo,jdbcType=VARCHAR},",
          "borrow_reason = #{borrowReason,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "is_welfare = #{isWelfare,jdbcType=BIT},",
          "category = #{category,jdbcType=BIT},",
          "borrower_id = #{borrowerId,jdbcType=INTEGER},",
          "borrower_name = #{borrowerName,jdbcType=VARCHAR},",
          "nature = #{nature,jdbcType=BIT},",
          "type = #{type,jdbcType=BIT},",
          "repayment = #{repayment,jdbcType=BIT},",
          "operator = #{operator,jdbcType=INTEGER},",
          "join_date = #{joinDate,jdbcType=INTEGER},",
          "pub_date = #{pubDate,jdbcType=INTEGER},",
          "value_date = #{valueDate,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "sell_amount = #{sellAmount,jdbcType=DECIMAL},",
          "threshold_amount = #{thresholdAmount,jdbcType=DECIMAL},",
          "increasing_amount = #{increasingAmount,jdbcType=DECIMAL},",
          "max_amount = #{maxAmount,jdbcType=DECIMAL},",
          "raise_date = #{raiseDate,jdbcType=INTEGER},",
          "deadline = #{deadline,jdbcType=INTEGER},",
          "repayment_date = #{repaymentDate,jdbcType=INTEGER},",
          "guarantors_id = #{guarantorsId,jdbcType=INTEGER},",
          "guarantors_name = #{guarantorsName,jdbcType=VARCHAR},",
          "guaranteed_amount = #{guaranteedAmount,jdbcType=DECIMAL},",
          "year_income = #{yearIncome,jdbcType=DECIMAL},",
          "extra_year_income = #{extraYearIncome,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=BIT},",
          "is_approve = #{isApprove,jdbcType=BIT},",
          "audit_advice = #{auditAdvice,jdbcType=VARCHAR},",
          "conftime = #{conftime,jdbcType=INTEGER},",
          "fee = #{fee,jdbcType=DECIMAL},",
          "full_scale_date = #{fullScaleDate,jdbcType=INTEGER},",
          "payment_amount = #{paymentAmount,jdbcType=DECIMAL},",
          "payment_date = #{paymentDate,jdbcType=INTEGER},",
          "is_retrial = #{isRetrial,jdbcType=BIT},",
          "retrial_advice = #{retrialAdvice,jdbcType=VARCHAR},",
          "second_conftime = #{secondConftime,jdbcType=INTEGER},",
          "term_total = #{termTotal,jdbcType=INTEGER},",
          "click_num = #{clickNum,jdbcType=INTEGER},",
          "overtime = #{overtime,jdbcType=INTEGER},",
          "series = #{series,jdbcType=INTEGER},",
          "template_id = #{templateId,jdbcType=INTEGER},",
          "proxy_id = #{proxyId,jdbcType=INTEGER},",
          "is_preview_repayment = #{isPreviewRepayment,jdbcType=TINYINT},",
          "pay_interest_day = #{payInterestDay,jdbcType=INTEGER},",
          "min_repayment_date = #{minRepaymentDate,jdbcType=VARCHAR},",
          "finish_preview_repayment = #{finishPreviewRepayment,jdbcType=BIT},",
          "preview_repayment_date = #{previewRepaymentDate,jdbcType=INTEGER},",
          "estimate_interest = #{estimateInterest,jdbcType=DECIMAL},",
          "intro = #{intro,jdbcType=LONGVARCHAR},",
          "guarantors_advice = #{guarantorsAdvice,jdbcType=LONGVARCHAR},",
          "risk_control = #{riskControl,jdbcType=LONGVARCHAR},",
          "material = #{material,jdbcType=LONGVARCHAR},",
          "repayment_remark = #{repaymentRemark,jdbcType=LONGVARCHAR},",
          "month = #{month,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ProductWithBLOBs record);

    @Update({
        "update hc_product",
        "set product_no = #{productNo,jdbcType=VARCHAR},",
          "contract_no = #{contractNo,jdbcType=VARCHAR},",
          "borrow_reason = #{borrowReason,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "is_welfare = #{isWelfare,jdbcType=BIT},",
          "category = #{category,jdbcType=BIT},",
          "borrower_id = #{borrowerId,jdbcType=INTEGER},",
          "borrower_name = #{borrowerName,jdbcType=VARCHAR},",
          "nature = #{nature,jdbcType=BIT},",
          "type = #{type,jdbcType=BIT},",
          "repayment = #{repayment,jdbcType=BIT},",
          "operator = #{operator,jdbcType=INTEGER},",
          "join_date = #{joinDate,jdbcType=INTEGER},",
          "pub_date = #{pubDate,jdbcType=INTEGER},",
          "value_date = #{valueDate,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "sell_amount = #{sellAmount,jdbcType=DECIMAL},",
          "threshold_amount = #{thresholdAmount,jdbcType=DECIMAL},",
          "increasing_amount = #{increasingAmount,jdbcType=DECIMAL},",
          "max_amount = #{maxAmount,jdbcType=DECIMAL},",
          "raise_date = #{raiseDate,jdbcType=INTEGER},",
          "deadline = #{deadline,jdbcType=INTEGER},",
          "repayment_date = #{repaymentDate,jdbcType=INTEGER},",
          "guarantors_id = #{guarantorsId,jdbcType=INTEGER},",
          "guarantors_name = #{guarantorsName,jdbcType=VARCHAR},",
          "guaranteed_amount = #{guaranteedAmount,jdbcType=DECIMAL},",
          "year_income = #{yearIncome,jdbcType=DECIMAL},",
          "extra_year_income = #{extraYearIncome,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=BIT},",
          "is_approve = #{isApprove,jdbcType=BIT},",
          "audit_advice = #{auditAdvice,jdbcType=VARCHAR},",
          "conftime = #{conftime,jdbcType=INTEGER},",
          "fee = #{fee,jdbcType=DECIMAL},",
          "full_scale_date = #{fullScaleDate,jdbcType=INTEGER},",
          "payment_amount = #{paymentAmount,jdbcType=DECIMAL},",
          "payment_date = #{paymentDate,jdbcType=INTEGER},",
          "is_retrial = #{isRetrial,jdbcType=BIT},",
          "retrial_advice = #{retrialAdvice,jdbcType=VARCHAR},",
          "second_conftime = #{secondConftime,jdbcType=INTEGER},",
          "term_total = #{termTotal,jdbcType=INTEGER},",
          "click_num = #{clickNum,jdbcType=INTEGER},",
          "overtime = #{overtime,jdbcType=INTEGER},",
          "series = #{series,jdbcType=INTEGER},",
          "template_id = #{templateId,jdbcType=INTEGER},",
          "proxy_id = #{proxyId,jdbcType=INTEGER},",
          "is_preview_repayment = #{isPreviewRepayment,jdbcType=TINYINT},",
          "pay_interest_day = #{payInterestDay,jdbcType=INTEGER},",
          "min_repayment_date = #{minRepaymentDate,jdbcType=VARCHAR},",
          "finish_preview_repayment = #{finishPreviewRepayment,jdbcType=BIT},",
          "preview_repayment_date = #{previewRepaymentDate,jdbcType=INTEGER},",
          "estimate_interest = #{estimateInterest,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Product record);


    @Select("SELECT * from hc_product")
    List<ProductWithBLOBs> selectProducts();

}