package com.example.scheduling.post.controller;

import com.example.scheduling.common.ApiCommonResponse;
import com.example.scheduling.post.dto.PostRequestDto;
import com.example.scheduling.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @GetMapping("/post/get/list")
    public ApiCommonResponse getPostList(@RequestBody PostRequestDto requestDto) {
        return ApiCommonResponse.success(postService.createPost(requestDto));
    }

    @GetMapping("/post/get")
    public ApiCommonResponse getPost(@PathVariable(name = "postId") Long postId) {
        return ApiCommonResponse.success(postService.getPost(postId));
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
