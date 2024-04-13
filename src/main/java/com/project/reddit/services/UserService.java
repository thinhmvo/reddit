package com.project.reddit.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.reddit.models.User;
import com.project.reddit.repositories.UserRepo;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> findAllUsers() {
        return userRepo.findAll();

    }

}