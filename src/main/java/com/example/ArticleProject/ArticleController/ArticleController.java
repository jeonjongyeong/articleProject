package com.example.ArticleProject.ArticleController;

import com.example.ArticleProject.dto.Article;
import com.example.ArticleProject.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {
@Autowired
    private ArticleService articleService;

    @RequestMapping("/list")
    public String show(Model model) {
        List<Article> articleList = articleService.getList();
        model.addAttribute("articleList", articleList);
        return "article_list";
    }

}
