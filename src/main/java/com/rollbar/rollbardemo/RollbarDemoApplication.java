package com.rollbar.rollbardemo;

import com.rollbar.rollbardemo.configs.properties.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class RollbarDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollbarDemoApplication.class, args);
	}

}
