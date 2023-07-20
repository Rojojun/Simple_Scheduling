package com.example.scheduling.post.dto;

import com.example.scheduling.post.entity.Post;
import lombok.Builder;
import lombok.Data;

@Data
public class PostRequestDto {
    public String title;
    public String content;

    @Builder
    public PostRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .build();
    }
}
