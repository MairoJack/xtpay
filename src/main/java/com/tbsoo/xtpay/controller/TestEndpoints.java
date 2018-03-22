package com.tbsoo.xtpay.controller;

import com.tbsoo.xtpay.model.Agent;
import com.tbsoo.xtpay.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestEndpoints extends BaseController{

    @Autowired
    private AgentService agentService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String getProduct(@RequestParam("username") String username,@RequestParam("password") String password) {
        Agent agent = new Agent();
        agent.setAgentNo(username);
        agent.setAgentPassword(passwordEncoder.encode(password));
        agentService.save(agent);
        return "success";
    }

}
