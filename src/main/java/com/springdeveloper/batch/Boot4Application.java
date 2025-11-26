package com.springdeveloper.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class Boot4Application {

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(Boot4Application.class, args)));

	}

}
