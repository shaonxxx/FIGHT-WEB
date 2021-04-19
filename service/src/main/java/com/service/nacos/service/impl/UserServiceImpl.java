package com.service.nacos.service.impl;

import com.service.nacos.entity.User;
import com.service.nacos.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser() {
        System.out.println("响应请求");
        return new User("xiao liuyang","15181383166");
    }
}
