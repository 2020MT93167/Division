package com.scalable.division;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DivisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DivisionApplication.class, args);
	}

}
