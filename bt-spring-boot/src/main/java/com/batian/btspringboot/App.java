package com.batian.btspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.batian.btspringboot.config.UniqueNameGenerator;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
