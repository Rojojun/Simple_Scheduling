package com.example.scheduling.post.dto;

import com.example.scheduling.post.entity.Post;
import lombok.Data;

@Data
public class PostResponseDtoOld {
    public PostResponseDtoOld(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.status = post.getStatusType().getName();
    }

    public Long id;
    public String title;
    public String content;
    public String status;
}
