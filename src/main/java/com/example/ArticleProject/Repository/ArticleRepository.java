package com.example.ArticleProject.Repository;

import com.example.ArticleProject.dto.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}