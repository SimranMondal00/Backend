package com.simsam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAppApplication.class, args);
		//System.out.println("Hello World");
		Aliens obj = context.getBean(Aliens.class);
		obj.code();
		System.out.println("Output");
//		Aliens obj1 = context.getBean(Aliens.class);
//		obj1.code();
	}

}
