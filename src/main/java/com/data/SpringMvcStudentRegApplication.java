package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.data","com.entity","com.repository"})
public class SpringMvcStudentRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcStudentRegApplication.class, args);
	}

}
