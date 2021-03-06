package com.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


@SpringBootApplication
@EnableSwagger2WebMvc
public class TweetApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TweetApplication.class, args);
	}

}
