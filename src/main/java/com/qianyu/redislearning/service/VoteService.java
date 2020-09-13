package com.qianyu.redislearning.service;

import com.qianyu.redislearning.domain.Article;
import com.qianyu.redislearning.domain.User;

/**
 * voted:set
 * time:zset
 * score:zset
 */
public interface VoteService {
    boolean voteForArticle(User user, Article article);
    boolean voteForArticle(int userID,String articleID);
}
