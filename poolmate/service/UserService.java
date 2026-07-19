package org.project.poolmate.service;

import org.project.poolmate.entity.UserEntity;
import org.project.poolmate.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo repo;
    public String register(UserEntity user)
    {
        UserEntity existing=repo.findByEmail(user.getEmail());
        if(existing==null && user.getPassword().equals(user.getConfirmPassword()))
        {
            repo.save(user);
            return "Signin successful";
        }
        return "Account already exists";
    }

    public String login(UserEntity user)
    {

        UserEntity existing=repo.findByEmail(user.getEmail());
        if(existing!=null &&  existing.getPassword().equals(user.getPassword()))
        {
            return "Login Successful";
        }
        return "sigup to the page";
    }
}
