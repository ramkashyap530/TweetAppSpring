package com.tweetapp.repository;

import com.tweetapp.model.Tweets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends MongoRepository<Tweets,String> {
    @Query("{'userName':{'$regex':'?0','$options':'i'}}")
    List<Tweets> findTweetsByuserName(String userName);
}
