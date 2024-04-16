package com.project.reddit.dtos;

import java.time.LocalDateTime;


import com.project.reddit.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String userEmail;
    private String password;
    private LocalDateTime createdDate;
    private String role;

    public User convertToUser() {
        User user = new User();
        user.setEmail(userEmail);
        user.setPassword(password);
        user.setCreatedAt(createdDate);
        user.setRole(role);

        return user;
    }

}
