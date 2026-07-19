package org.project.poolmate.controller;

import org.project.poolmate.entity.UserEntity;
import org.project.poolmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService ser;
    @PostMapping("/register")
    public String register(@RequestBody UserEntity user)
    {
        return ser.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody UserEntity user)
    {
        return ser.login(user);
    }
}
