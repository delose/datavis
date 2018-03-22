package com.delose.datavis.datavis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.delose.datavis.controller"})
public class DatavisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatavisApplication.class, args);
	}
}
