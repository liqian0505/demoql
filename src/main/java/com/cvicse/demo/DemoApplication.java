package com.cvicse.demo;

import com.cvicse.demo.resolver.ContractResolver;
import com.cvicse.demo.resolver.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ContractResolver contractResolver() {
		return new ContractResolver();
	}

	@Bean
	public Query query() {
		return new Query();
	}

}
