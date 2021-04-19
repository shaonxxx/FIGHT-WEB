package nacos.controller;


import nacos.entity.User;
import nacos.http.UserApiHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customerUser")
public class UserController {

    @Autowired
    UserApiHttpClient userApiHttpClient;


    @RequestMapping("getUser")
    User getUser(){
        return userApiHttpClient.getUser();
    }

}
