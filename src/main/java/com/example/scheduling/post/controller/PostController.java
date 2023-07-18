package com.example.scheduling.post.controller;

import com.example.scheduling.common.ApiCommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/post/get/list")
    public ApiCommonResponse getPostList() {
        return ApiCommonResponse.noContent();
    }

    @GetMapping("/post/get")
    public void getPost() {

    }

    @PostMapping("/post/create")
    public void createPost() {

    }

    @PostMapping("/delete/post")
    public void deletePost() {

    }

    @PostMapping("/update/post")
    public void updatePost() {

    }
}
