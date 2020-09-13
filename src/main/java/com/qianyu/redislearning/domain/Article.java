package com.qianyu.redislearning.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Time;
import java.util.Objects;

public class Article {
    String id;
    String title;
    String link;
    String poster;
    Long time;
    Integer votes;

    Article(){

    }
    public Article(String id, String title, String link, String poster, Long time, Integer votes) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.poster = poster;
        this.time = time;
        this.votes = votes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(id, article.id) &&
                Objects.equals(title, article.title) &&
                Objects.equals(link, article.link) &&
                Objects.equals(poster, article.poster) &&
                Objects.equals(time, article.time) &&
                Objects.equals(votes, article.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, link, poster, time, votes);
    }
}
