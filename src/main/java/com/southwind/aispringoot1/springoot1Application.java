package com.southwind.aispringoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.southwind")
public class springoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(springoot1Application.class, args);
	}

}
