package com.example.ArticleProject.ArticleController;

import com.example.ArticleProject.Repository.ArticleRepository;
import com.example.ArticleProject.dto.Article;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {

    private final ArticleRepository articleRepository;

    @RequestMapping("/list")
    public String show(Model model) {
        List<Article> articleList = this.articleRepository.findAll();
        model.addAttribute("articleList", articleList);
        return "article_list";
    }

}
