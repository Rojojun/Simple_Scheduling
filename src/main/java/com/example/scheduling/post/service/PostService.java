package com.example.scheduling.post.service;

import com.example.scheduling.post.dto.PostRequestDtoOld;
import com.example.scheduling.post.dto.PostResponseDtoOld;
import com.example.scheduling.post.entity.Post;
import com.example.scheduling.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(PostRequestDtoOld postRequestDtoOld) {
        Post post = postRequestDtoOld.toEntity();
        return postRepository.save(post);
    }

    public void getPostList() {
        List<Post> postList = postRepository.findAll();
    }

    public PostResponseDtoOld getPost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new RuntimeException("알 수 없는 오류"));
        return new PostResponseDtoOld(post);
    }

    public void deletePost() {

    }

    public void updatePost() {

    }
}
