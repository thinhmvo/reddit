package com.project.reddit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.project.reddit.models.User;
import com.project.reddit.repositories.UseableUserDetail;
import com.project.reddit.repositories.UserRepo;

public class UserDetailService implements UseableUserDetail{

    @Autowired
    UserRepo userRepo;

    @Override
    public User loadUserByUsername(String userName) {
        User user = userRepo.findByUserName(userName);
        if (user != null) return user;
        
        throw new UsernameNotFoundException("User " + userName + " not found");
    }
}
