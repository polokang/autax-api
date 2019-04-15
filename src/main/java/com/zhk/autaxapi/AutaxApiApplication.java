package com.zhk.autaxapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class AutaxApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutaxApiApplication.class, args);
	}

}
