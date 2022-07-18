package com.example.ArticleProject.Repository;


import com.example.ArticleProject.dto.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
}