package com.tweetapp.controller;

//import com.tweetapp.kafka.Producer;
import com.tweetapp.model.Reply;
import com.tweetapp.model.Tweets;
import com.tweetapp.model.User;
import com.tweetapp.service.TweetService;
import com.tweetapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//JSON
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1.0/tweets")
public class UserTweetController {
    @Autowired
    private UserService userService;

    @Autowired
    private TweetService tweetservice;

  //  public Producer producer;

    @GetMapping(path = "/test")
    public String gettest() {
        return "it is done Jenkins 123";
    }

    @PostMapping(path = "/register")
    public User registerUSer(@RequestBody User user) {
        return userService.registerUser(user);

    }

    @PostMapping(path = "/login")
    public User loginUser(@RequestBody User user) {
        User loggedInUser = userService.loginUser(user);
        System.out.println(loggedInUser);
        return loggedInUser;

    }

    @PostMapping(path = "/{userName}/forgot")
    public User updatePassword(@RequestBody User user, @PathVariable String userName) {
        User loggedInUser = userService.updatePassword(user, userName);
        System.out.println(loggedInUser);
        return loggedInUser;

    }

    @GetMapping(path = "/user/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/user/search/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return userService.getUserByName(userName);
    }

    @PostMapping(path = "/{userName}/add")
    public Tweets postTweet(@RequestBody Tweets tweet, @PathVariable String userName) {
        return tweetservice.postTweet(tweet, userName);

    }

    @GetMapping(path = "/all")
    public List<Tweets> getAllTweets() {
        List<Tweets> tweet = tweetservice.getAllTweets();
        return tweet;
    }

    @PutMapping(path = "/update/{tweetId}")
    public Tweets updateTweet(@RequestBody Tweets tweet, @PathVariable String tweetId) {
        Tweets updatedTweet = tweetservice.updateTweet(tweet, tweetId);
        return updatedTweet;
    }

    @DeleteMapping(path = "/delete/{tweetId}")
    public void deleteTweet(@PathVariable String tweetId) {
        tweetservice.deleteTweetbyId(tweetId);

    }

    @PostMapping(path = "/{userName}/reply")
    public Reply postReply(@RequestBody Reply reply) {
        return tweetservice.postReply(reply);

    }

    @GetMapping(path = "/all/{userName}")
    public List<Tweets> getTweetByUser(@PathVariable String userName) {
        return tweetservice.getTweetsByUser(userName);
    }

    @GetMapping(path = "/getReply/{tweetId}")
    public List<Tweets> getTweetReply(@PathVariable String tweetId) {
        return tweetservice.getTweetsReply(tweetId);
    }

//    @Autowired
//    UserTweetController(Producer producer) {
//        this.producer = producer;
//
//    }
//
//    @GetMapping("/publish")
//    public String sendMessage(@PathVariable String message) {
//        System.out.println("RAM--> "+message);
//        this.producer.sendMessage(message);
//        return "connection established";
//
//    }
}
