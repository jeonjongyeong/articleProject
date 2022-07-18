package com.example.ArticleProject.service;

import com.example.ArticleProject.Repository.ArticleRepository;
import com.example.ArticleProject.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getList() {
        return articleRepository.findAll();
    }
}