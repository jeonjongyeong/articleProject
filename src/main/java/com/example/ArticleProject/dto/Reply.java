package com.example.ArticleProject.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column
    private String name;

    @Column(columnDefinition = "TEXT")
    private String comment;

    private LocalDateTime create_Date;


}
