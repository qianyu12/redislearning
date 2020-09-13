package com.qianyu.redislearning.controller;

import com.qianyu.redislearning.domain.Article;
import com.qianyu.redislearning.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteWebController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/addArticle")
    public Article addArticle(){
        Article article = new Article("1","test","www.baidu.com","fanxu",System.currentTimeMillis(),0);
        articleService.addArticle(article);
        return articleService.getArticle("1");
    }
}
