package com.jojoldu.book.freelecspringboot3webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FreelecSpringboot3WebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelecSpringboot3WebserviceApplication.class, args);
	}

}
