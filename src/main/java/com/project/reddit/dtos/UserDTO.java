package com.project.reddit.dtos;

import java.time.LocalDateTime;


import com.project.reddit.models.User;

public class UserDTO {

    private Long id;
    private String userName;
    private LocalDateTime createdDate;
    private String role;

    public User convertToUser() {
        User user = new User();
        user.setUserName(userName);
        user.setCreatedAt(createdDate);
        user.setRole(role);

        return user;
    }

}
