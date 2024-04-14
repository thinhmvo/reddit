package com.project.reddit.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column
    private String role;


    @Column(name = "created_at")
    private Date createdAt;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Post> posts;
    
   

}
