package com.example.ArticleProject.ArticleController;

import com.example.ArticleProject.Repository.ArticleRepository;
import com.example.ArticleProject.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    public ArticleRepository articleRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<Article> show() {
        return articleRepository.findAll();
    }

}
