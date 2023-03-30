package com.example.scheduling.user.entity;

import com.example.scheduling.common.StatusType;
import com.example.scheduling.post.entity.Post;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    private String password;

    @NotBlank
    @NotNull
    private String userId;

    @NotBlank
    @NotNull
    private String nickname;

    @Enumerated(EnumType.STRING)
    private StatusType statusType;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Post> posts;
}
