package com.qianyu.redislearning.service;

import com.qianyu.redislearning.domain.Article;

public interface ArticleService {
    boolean addArticle(Article article);
    boolean updateArticle(Article article);
    boolean delArticle(Article article);
    boolean delArticle(String id);
    Article getArticle(String id);
}
