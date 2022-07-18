package com.example.ArticleProject.ArticleController;

import com.example.ArticleProject.Repository.ReplyRepository;
import com.example.ArticleProject.dto.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    private ReplyRepository ReplyRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<Reply> showReply() {
        return ReplyRepository.findAll();
    }
}