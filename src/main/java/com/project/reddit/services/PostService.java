package com.project.reddit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.reddit.models.Post;
import com.project.reddit.repositories.PostRepository;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAllPost() {
        
        return postRepository.findAll();
        
    }
}
