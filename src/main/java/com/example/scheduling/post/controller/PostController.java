package com.example.scheduling.post.controller;

import com.example.scheduling.common.ApiCommonResponse;
import com.example.scheduling.post.dto.PostRequestDto;
import com.example.scheduling.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @GetMapping("/post/get/list")
    public ApiCommonResponse getPostList(@RequestBody PostRequestDto requestDto) {
        return ApiCommonResponse.success(postService.createPost(requestDto));
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
