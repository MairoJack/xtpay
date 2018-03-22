package com.tbsoo.xtpay.dao;

import com.tbsoo.xtpay.model.Agent;
import org.apache.ibatis.jdbc.SQL;

public class AgentSqlProvider {

    public String insertSelective(Agent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("xtpay_agent");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAgentNo() != null) {
            sql.VALUES("agent_no", "#{agentNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentPassword() != null) {
            sql.VALUES("agent_password", "#{agentPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentName() != null) {
            sql.VALUES("agent_name", "#{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getParentAgentId() != null) {
            sql.VALUES("parent_agent_id", "#{parentAgentId,jdbcType=INTEGER}");
        }
        
        if (record.getAreaCode() != null) {
            sql.VALUES("area_code", "#{areaCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProposer() != null) {
            sql.VALUES("proposer", "#{proposer,jdbcType=VARCHAR}");
        }
        
        if (record.getContactPhone() != null) {
            sql.VALUES("contact_phone", "#{contactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPostcode() != null) {
            sql.VALUES("postcode", "#{postcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessRegistrationName() != null) {
            sql.VALUES("business_registration_name", "#{businessRegistrationName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganizationCode() != null) {
            sql.VALUES("organization_code", "#{organizationCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessLicenseNo() != null) {
            sql.VALUES("business_license_no", "#{businessLicenseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTaxRegistrationNo() != null) {
            sql.VALUES("tax_registration_no", "#{taxRegistrationNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessScope() != null) {
            sql.VALUES("business_scope", "#{businessScope,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisteredCapital() != null) {
            sql.VALUES("registered_capital", "#{registeredCapital,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterAccountBank() != null) {
            sql.VALUES("master_account_bank", "#{masterAccountBank,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterAccountBankName() != null) {
            sql.VALUES("master_account_bank_name", "#{masterAccountBankName,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterAccountName() != null) {
            sql.VALUES("master_account_name", "#{masterAccountName,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterAccountNo() != null) {
            sql.VALUES("master_account_no", "#{masterAccountNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCorporationName() != null) {
            sql.VALUES("corporation_name", "#{corporationName,jdbcType=VARCHAR}");
        }
        
        if (record.getCorporationIdentityCard() != null) {
            sql.VALUES("corporation_identity_card", "#{corporationIdentityCard,jdbcType=VARCHAR}");
        }
        
        if (record.getCorporationPhone() != null) {
            sql.VALUES("corporation_phone", "#{corporationPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getWechatScanRate() != null) {
            sql.VALUES("wechat_scan_rate", "#{wechatScanRate,jdbcType=DECIMAL}");
        }
        
        if (record.getAlipaySacnRate() != null) {
            sql.VALUES("alipay_sacn_rate", "#{alipaySacnRate,jdbcType=DECIMAL}");
        }
        
        if (record.getAlipayServiceRate() != null) {
            sql.VALUES("alipay_service_rate", "#{alipayServiceRate,jdbcType=DECIMAL}");
        }
        
        if (record.getWechatPublicRate() != null) {
            sql.VALUES("wechat_public_rate", "#{wechatPublicRate,jdbcType=DECIMAL}");
        }
        
        if (record.getQqRate() != null) {
            sql.VALUES("qq_rate", "#{qqRate,jdbcType=DECIMAL}");
        }
        
        if (record.getGatewayRate() != null) {
            sql.VALUES("gateway_rate", "#{gatewayRate,jdbcType=DECIMAL}");
        }
        
        if (record.getQuickRate() != null) {
            sql.VALUES("quick_rate", "#{quickRate,jdbcType=DECIMAL}");
        }
        
        if (record.getWapRate() != null) {
            sql.VALUES("wap_rate", "#{wapRate,jdbcType=DECIMAL}");
        }
        
        if (record.getBusinessContact() != null) {
            sql.VALUES("business_contact", "#{businessContact,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessContactPhone() != null) {
            sql.VALUES("business_contact_phone", "#{businessContactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessContactQq() != null) {
            sql.VALUES("business_contact_qq", "#{businessContactQq,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessContactEmail() != null) {
            sql.VALUES("business_contact_email", "#{businessContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getFax() != null) {
            sql.VALUES("fax", "#{fax,jdbcType=VARCHAR}");
        }
        
        if (record.getApplyTime() != null) {
            sql.VALUES("apply_time", "#{applyTime,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=BIGINT}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperatorName() != null) {
            sql.VALUES("operator_name", "#{operatorName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Agent record) {
        SQL sql = new SQL();
        sql.UPDATE("xtpay_agent");
        
        if (record.getAgentNo() != null) {
            sql.SET("agent_no = #{agentNo,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentPassword() != null) {
            sql.SET("agent_password = #{agentPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentName() != null) {
            sql.SET("agent_name = #{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getParentAgentId() != null) {
            sql.SET("parent_agent_id = #{parentAgentId,jdbcType=INTEGER}");
        }
        
        if (record.getAreaCode() != null) {
            sql.SET("area_code = #{areaCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProposer() != null) {
            sql.SET("proposer = #{proposer,jdbcType=VARCHAR}");
        }
        
        if (record.getContactPhone() != null) {
            sql.SET("contact_phone = #{contactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPostcode() != null) {
            sql.SET("postcode = #{postcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessRegistrationName() != null) {
            sql.SET("business_registration_name = #{businessRegistrationName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrganizationCode() != null) {
            sql.SET("organization_code = #{organizationCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessLicenseNo() != null) {
            sql.SET("business_license_no = #{businessLicenseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTaxRegistrationNo() != null) {
            sql.SET("tax_registration_no = #{taxRegistrationNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessScope() != null) {
            sql.SET("business_scope = #{businessScope,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisteredCapital() != null) {
            sql.SET("registered_capital = #{registeredCapital,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterAccountBank() != null) {
            sql.SET("master_account_bank = #{masterAccountBank,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterAccountBankName() != null) {
            sql.SET("master_account_bank_name = #{masterAccountBankName,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterAccountName() != null) {
            sql.SET("master_account_name = #{masterAccountName,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterAccountNo() != null) {
            sql.SET("master_account_no = #{masterAccountNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCorporationName() != null) {
            sql.SET("corporation_name = #{corporationName,jdbcType=VARCHAR}");
        }
        
        if (record.getCorporationIdentityCard() != null) {
            sql.SET("corporation_identity_card = #{corporationIdentityCard,jdbcType=VARCHAR}");
        }
        
        if (record.getCorporationPhone() != null) {
            sql.SET("corporation_phone = #{corporationPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getWechatScanRate() != null) {
            sql.SET("wechat_scan_rate = #{wechatScanRate,jdbcType=DECIMAL}");
        }
        
        if (record.getAlipaySacnRate() != null) {
            sql.SET("alipay_sacn_rate = #{alipaySacnRate,jdbcType=DECIMAL}");
        }
        
        if (record.getAlipayServiceRate() != null) {
            sql.SET("alipay_service_rate = #{alipayServiceRate,jdbcType=DECIMAL}");
        }
        
        if (record.getWechatPublicRate() != null) {
            sql.SET("wechat_public_rate = #{wechatPublicRate,jdbcType=DECIMAL}");
        }
        
        if (record.getQqRate() != null) {
            sql.SET("qq_rate = #{qqRate,jdbcType=DECIMAL}");
        }
        
        if (record.getGatewayRate() != null) {
            sql.SET("gateway_rate = #{gatewayRate,jdbcType=DECIMAL}");
        }
        
        if (record.getQuickRate() != null) {
            sql.SET("quick_rate = #{quickRate,jdbcType=DECIMAL}");
        }
        
        if (record.getWapRate() != null) {
            sql.SET("wap_rate = #{wapRate,jdbcType=DECIMAL}");
        }
        
        if (record.getBusinessContact() != null) {
            sql.SET("business_contact = #{businessContact,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessContactPhone() != null) {
            sql.SET("business_contact_phone = #{businessContactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessContactQq() != null) {
            sql.SET("business_contact_qq = #{businessContactQq,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessContactEmail() != null) {
            sql.SET("business_contact_email = #{businessContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getFax() != null) {
            sql.SET("fax = #{fax,jdbcType=VARCHAR}");
        }
        
        if (record.getApplyTime() != null) {
            sql.SET("apply_time = #{applyTime,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=BIGINT}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getOperatorName() != null) {
            sql.SET("operator_name = #{operatorName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}