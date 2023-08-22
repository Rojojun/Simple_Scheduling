package com.example.scheduling.post.entity;

import com.example.scheduling.common.StatusType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    private String title;

    @NotBlank
    @NotNull
    private String content;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusType statusType;

    @NotNull
    private String writer;

    @Builder
    public Post(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.statusType = StatusType.USED;
    }
}
