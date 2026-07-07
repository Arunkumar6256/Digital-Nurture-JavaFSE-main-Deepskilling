package com.cognizant.spring_learn;

import com.cognizant.spring_learn.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
class SpringLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);


	}

}
