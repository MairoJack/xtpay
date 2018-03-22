package com.tbsoo.xtpay.service.impl;

import com.tbsoo.xtpay.dao.AgentMapper;
import com.tbsoo.xtpay.model.Agent;
import com.tbsoo.xtpay.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("agentService")
public class AgentServiceImpl implements AgentService{

    @Autowired
    private AgentMapper agentMapper;
    @Override
    public void save(Agent agent) {
        agentMapper.insertSelective(agent);
    }

    @Override
    public Agent getAgent(Integer id) {
        return agentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Agent> list() {
        return agentMapper.selectList();
    }
}
