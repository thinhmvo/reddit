package com.project.reddit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.reddit.models.Post;
import com.project.reddit.services.PostService;

@RestController
@RequestMapping("/v1/posts")
public class PostController {
 
    @Autowired
    private PostService postService;
    
    @GetMapping
    public List<Post> findAllPost() {
        return postService.findAllPost();
    }
}
