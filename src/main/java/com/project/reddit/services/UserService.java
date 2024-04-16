package com.project.reddit.services;


import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.reddit.dtos.UserDTO;
import com.project.reddit.models.User;
import com.project.reddit.repositories.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> findAllUsers() {
        return userRepo.findAll();

    }

    public Optional<User> findById(long id) {
         Optional<User> returnedUser = userRepo.findById(id);

         if(returnedUser.isPresent()) return returnedUser;

         return null;

        }

    
    public User savUser(UserDTO userDTO) {
        return userRepo.save(userDTO.convertToUser());
    }

    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }

    
    
    
    
}
