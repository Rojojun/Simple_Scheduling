package com.example.scheduling.post.dto;

import com.example.scheduling.post.entity.Post;

public record PostRequestDto(String title, String content) {

    public Post toEntity() {
        return new Post(title, content);
    }
}
