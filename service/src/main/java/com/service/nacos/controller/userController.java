package com.service.nacos.controller;


import com.service.nacos.entity.User;
import com.service.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class userController {

    @Autowired
    UserService userservice;


    @RequestMapping("getUser")
    User getUser(){
        return userservice.getUser();
    }

}
