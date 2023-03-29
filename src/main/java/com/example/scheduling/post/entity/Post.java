package com.example.scheduling.post.entity;

import com.example.scheduling.user.entity.User;
import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @ManyToOne(cascade = CascadeType.PERSIST)       // 영속성 전이 문제 해결
    @JoinColumn()
    private User writer;
}
