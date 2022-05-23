package com.tweetapp.repository;

import com.tweetapp.model.Reply;
import com.tweetapp.model.Tweets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends MongoRepository<Reply,String> {
    @Query("{'tweetId': ?0}")
    List<Tweets> findReplyByTweet(String tweetId);
}
