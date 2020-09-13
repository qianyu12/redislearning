package com.qianyu.redislearning.service.impl;

import com.qianyu.redislearning.domain.Article;
import com.qianyu.redislearning.service.ArticleService;
import com.qianyu.redislearning.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean addArticle(Article article) {
        String articleID = "article:"+article.getId();
        System.out.println(articleID);
        return redisUtil.set(articleID,article);
    }

    @Override
    public boolean updateArticle(Article article) {
        return false;
    }

    @Override
    public boolean delArticle(Article article) {
        return false;
    }

    @Override
    public boolean delArticle(String id) {
        return false;
    }

    @Override
    public Article getArticle(String id) {
        Article article = (Article)redisUtil.get("article:"+id);
        System.out.println(article);
        return article;
    }
}
