package com.tweetapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reply")
public class Reply {
    @Id
    private String replyId;
    private String message;
    private String msgPostTime;
    private String userName;
    private String tweetId;

    public Reply() {
    }

    public Reply(String replyId, String message, String msgPostTime, String userName, String tweetId) {
        this.replyId = replyId;
        this.message = message;
        this.msgPostTime = msgPostTime;
        this.userName = userName;
        this.tweetId = tweetId;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }
}
