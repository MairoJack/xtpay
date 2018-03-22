package com.tbsoo.xtpay.service;

import com.tbsoo.xtpay.model.Agent;

import java.util.List;

public interface AgentService {
    void save(Agent agent);
    Agent getAgent(Integer id);
    List<Agent> list();
}
