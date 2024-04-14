package com.project.reddit.dtos;

import java.time.LocalDateTime;

import com.project.reddit.models.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private Long id;

    private String title;

    private String body;

    private String status;

    private LocalDateTime createdDate;

    public Post convertToPost() {
        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setBody(body);
        newPost.setStatus(status);
        newPost.setCreateDate(createdDate);

        return newPost;

    }

}
