package com.tweetapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tweet")
public class Tweets {

    @Id
    private String tweetId;

    private String message;
    private String msgPostTime;
    private Integer like;
    private String userName;

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsgPostTime() {
        return msgPostTime;
    }

    public void setMsgPostTime(String msgPostTime) {
        this.msgPostTime = msgPostTime;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
