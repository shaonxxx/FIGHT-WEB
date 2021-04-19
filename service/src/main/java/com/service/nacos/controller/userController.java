package com.service.nacos.controller;


import com.service.nacos.entity.User;
import com.service.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("user")
public class userController {

    @Autowired
    UserService userservice;
    @Value("${nacos.testParam}")
    private String testParam;


    @RequestMapping("getUser")
    User getUser(){
        return userservice.getUser();
    }

    @PostConstruct
    private void test(){
        System.out.println("1231----------"+testParam);
    }

}
