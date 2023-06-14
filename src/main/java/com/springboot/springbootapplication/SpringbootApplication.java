package com.springboot.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages ="com.springboot.springbootapplication.dto")
@EnableJpaRepositories(basePackages = "com.springboot.springbootapplication.repo") 
@SpringBootApplication(scanBasePackages ="com.springboot.springbootapplication.controller" )
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
