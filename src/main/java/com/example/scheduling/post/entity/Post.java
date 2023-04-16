package com.example.scheduling.post.entity;

import com.example.scheduling.common.StatusType;
import com.example.scheduling.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    /*@NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_Id", foreignKey = @ForeignKey(name = "fk_Post_User"))
    private User writer;*/
}
