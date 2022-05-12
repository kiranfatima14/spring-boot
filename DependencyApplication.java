package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DependencyApplication.class, args);
		Coustomers c = context.getBean(Coustomers.class);
		c.display();
		
	}

}
