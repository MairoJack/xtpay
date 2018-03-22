package com.tbsoo.xtpay.dao;

import com.tbsoo.xtpay.model.Agent;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("agentMapper")
public interface AgentMapper {
    @Delete({
        "delete from xtpay_agent",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into xtpay_agent (id, agent_no, ",
        "agent_password, agent_name, ",
        "parent_agent_id, area_code, ",
        "proposer, contact_phone, ",
        "address, postcode, ",
        "business_registration_name, organization_code, ",
        "business_license_no, tax_registration_no, ",
        "business_scope, registered_capital, ",
        "master_account_bank, master_account_bank_name, ",
        "master_account_name, master_account_no, ",
        "corporation_name, corporation_identity_card, ",
        "corporation_phone, wechat_scan_rate, ",
        "alipay_sacn_rate, alipay_service_rate, ",
        "wechat_public_rate, qq_rate, ",
        "gateway_rate, quick_rate, ",
        "wap_rate, business_contact, ",
        "business_contact_phone, business_contact_qq, ",
        "business_contact_email, fax, ",
        "apply_time, status, ",
        "create_time, operator_id, ",
        "operator_name)",
        "values (#{id,jdbcType=INTEGER}, #{agentNo,jdbcType=VARCHAR}, ",
        "#{agentPassword,jdbcType=VARCHAR}, #{agentName,jdbcType=VARCHAR}, ",
        "#{parentAgentId,jdbcType=INTEGER}, #{areaCode,jdbcType=VARCHAR}, ",
        "#{proposer,jdbcType=VARCHAR}, #{contactPhone,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{postcode,jdbcType=VARCHAR}, ",
        "#{businessRegistrationName,jdbcType=VARCHAR}, #{organizationCode,jdbcType=VARCHAR}, ",
        "#{businessLicenseNo,jdbcType=VARCHAR}, #{taxRegistrationNo,jdbcType=VARCHAR}, ",
        "#{businessScope,jdbcType=VARCHAR}, #{registeredCapital,jdbcType=DECIMAL}, ",
        "#{masterAccountBank,jdbcType=VARCHAR}, #{masterAccountBankName,jdbcType=VARCHAR}, ",
        "#{masterAccountName,jdbcType=VARCHAR}, #{masterAccountNo,jdbcType=VARCHAR}, ",
        "#{corporationName,jdbcType=VARCHAR}, #{corporationIdentityCard,jdbcType=VARCHAR}, ",
        "#{corporationPhone,jdbcType=VARCHAR}, #{wechatScanRate,jdbcType=DECIMAL}, ",
        "#{alipaySacnRate,jdbcType=DECIMAL}, #{alipayServiceRate,jdbcType=DECIMAL}, ",
        "#{wechatPublicRate,jdbcType=DECIMAL}, #{qqRate,jdbcType=DECIMAL}, ",
        "#{gatewayRate,jdbcType=DECIMAL}, #{quickRate,jdbcType=DECIMAL}, ",
        "#{wapRate,jdbcType=DECIMAL}, #{businessContact,jdbcType=VARCHAR}, ",
        "#{businessContactPhone,jdbcType=VARCHAR}, #{businessContactQq,jdbcType=VARCHAR}, ",
        "#{businessContactEmail,jdbcType=VARCHAR}, #{fax,jdbcType=VARCHAR}, ",
        "#{applyTime,jdbcType=BIGINT}, #{status,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=BIGINT}, #{operatorId,jdbcType=INTEGER}, ",
        "#{operatorName,jdbcType=VARCHAR})"
    })
    int insert(Agent record);

    @InsertProvider(type=AgentSqlProvider.class, method="insertSelective")
    int insertSelective(Agent record);

    @Select({
        "select",
        "id, agent_no, agent_password, agent_name, parent_agent_id, area_code, proposer, ",
        "contact_phone, address, postcode, business_registration_name, organization_code, ",
        "business_license_no, tax_registration_no, business_scope, registered_capital, ",
        "master_account_bank, master_account_bank_name, master_account_name, master_account_no, ",
        "corporation_name, corporation_identity_card, corporation_phone, wechat_scan_rate, ",
        "alipay_sacn_rate, alipay_service_rate, wechat_public_rate, qq_rate, gateway_rate, ",
        "quick_rate, wap_rate, business_contact, business_contact_phone, business_contact_qq, ",
        "business_contact_email, fax, apply_time, status, create_time, operator_id, operator_name",
        "from xtpay_agent",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="agent_no", property="agentNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_password", property="agentPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_agent_id", property="parentAgentId", jdbcType=JdbcType.INTEGER),
        @Result(column="area_code", property="areaCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="proposer", property="proposer", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_phone", property="contactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="postcode", property="postcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_registration_name", property="businessRegistrationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="organization_code", property="organizationCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_license_no", property="businessLicenseNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="tax_registration_no", property="taxRegistrationNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_scope", property="businessScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="registered_capital", property="registeredCapital", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_account_bank", property="masterAccountBank", jdbcType=JdbcType.VARCHAR),
        @Result(column="master_account_bank_name", property="masterAccountBankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="master_account_name", property="masterAccountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="master_account_no", property="masterAccountNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="corporation_name", property="corporationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="corporation_identity_card", property="corporationIdentityCard", jdbcType=JdbcType.VARCHAR),
        @Result(column="corporation_phone", property="corporationPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="wechat_scan_rate", property="wechatScanRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="alipay_sacn_rate", property="alipaySacnRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="alipay_service_rate", property="alipayServiceRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="wechat_public_rate", property="wechatPublicRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="qq_rate", property="qqRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="gateway_rate", property="gatewayRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="quick_rate", property="quickRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="wap_rate", property="wapRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="business_contact", property="businessContact", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_contact_phone", property="businessContactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_contact_qq", property="businessContactQq", jdbcType=JdbcType.VARCHAR),
        @Result(column="business_contact_email", property="businessContactEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="fax", property="fax", jdbcType=JdbcType.VARCHAR),
        @Result(column="apply_time", property="applyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator_name", property="operatorName", jdbcType=JdbcType.VARCHAR)
    })
    Agent selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AgentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Agent record);

    @Update({
        "update xtpay_agent",
        "set agent_no = #{agentNo,jdbcType=VARCHAR},",
          "agent_password = #{agentPassword,jdbcType=VARCHAR},",
          "agent_name = #{agentName,jdbcType=VARCHAR},",
          "parent_agent_id = #{parentAgentId,jdbcType=INTEGER},",
          "area_code = #{areaCode,jdbcType=VARCHAR},",
          "proposer = #{proposer,jdbcType=VARCHAR},",
          "contact_phone = #{contactPhone,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "postcode = #{postcode,jdbcType=VARCHAR},",
          "business_registration_name = #{businessRegistrationName,jdbcType=VARCHAR},",
          "organization_code = #{organizationCode,jdbcType=VARCHAR},",
          "business_license_no = #{businessLicenseNo,jdbcType=VARCHAR},",
          "tax_registration_no = #{taxRegistrationNo,jdbcType=VARCHAR},",
          "business_scope = #{businessScope,jdbcType=VARCHAR},",
          "registered_capital = #{registeredCapital,jdbcType=DECIMAL},",
          "master_account_bank = #{masterAccountBank,jdbcType=VARCHAR},",
          "master_account_bank_name = #{masterAccountBankName,jdbcType=VARCHAR},",
          "master_account_name = #{masterAccountName,jdbcType=VARCHAR},",
          "master_account_no = #{masterAccountNo,jdbcType=VARCHAR},",
          "corporation_name = #{corporationName,jdbcType=VARCHAR},",
          "corporation_identity_card = #{corporationIdentityCard,jdbcType=VARCHAR},",
          "corporation_phone = #{corporationPhone,jdbcType=VARCHAR},",
          "wechat_scan_rate = #{wechatScanRate,jdbcType=DECIMAL},",
          "alipay_sacn_rate = #{alipaySacnRate,jdbcType=DECIMAL},",
          "alipay_service_rate = #{alipayServiceRate,jdbcType=DECIMAL},",
          "wechat_public_rate = #{wechatPublicRate,jdbcType=DECIMAL},",
          "qq_rate = #{qqRate,jdbcType=DECIMAL},",
          "gateway_rate = #{gatewayRate,jdbcType=DECIMAL},",
          "quick_rate = #{quickRate,jdbcType=DECIMAL},",
          "wap_rate = #{wapRate,jdbcType=DECIMAL},",
          "business_contact = #{businessContact,jdbcType=VARCHAR},",
          "business_contact_phone = #{businessContactPhone,jdbcType=VARCHAR},",
          "business_contact_qq = #{businessContactQq,jdbcType=VARCHAR},",
          "business_contact_email = #{businessContactEmail,jdbcType=VARCHAR},",
          "fax = #{fax,jdbcType=VARCHAR},",
          "apply_time = #{applyTime,jdbcType=BIGINT},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=BIGINT},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "operator_name = #{operatorName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Agent record);

    @Select("select * from xtpay_agent")
    List<Agent> selectList();

    @Select("select id,agent_no,agent_password from xtpay_agent where agent_no = #{agentNo}")
    @ResultType(Agent.class)
    Agent selectByAgentNo(String agentNo);
}