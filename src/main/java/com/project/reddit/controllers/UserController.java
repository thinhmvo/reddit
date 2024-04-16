package com.project.reddit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.reddit.dtos.UserDTO;
import com.project.reddit.models.User;
import com.project.reddit.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAllUsers();

        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findUserById(@PathVariable int id) {
        Optional<User> returnedUser = userService.findById(id);

        return new ResponseEntity<Optional<User>>(returnedUser, HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody  UserDTO newUserDTO) {
        User retunredUser = userService.saveUser(newUserDTO);
        return new ResponseEntity<User>(retunredUser, HttpStatus.CREATED);
    }


}
