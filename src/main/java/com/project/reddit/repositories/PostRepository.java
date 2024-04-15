package com.project.reddit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.reddit.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>  {
    

}
