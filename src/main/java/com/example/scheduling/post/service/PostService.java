package com.example.scheduling.post.service;

import com.example.scheduling.post.dto.PostRequestDto;
import com.example.scheduling.post.entity.Post;
import com.example.scheduling.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(PostRequestDto postRequestDto) {
        Post post = postRequestDto.toEntity();
        return postRepository.save(post);
    }

    public void getPostList() {

    }

    public void getPost() {

    }

    public void deletePost() {

    }

    public void updatePost() {

    }
}
