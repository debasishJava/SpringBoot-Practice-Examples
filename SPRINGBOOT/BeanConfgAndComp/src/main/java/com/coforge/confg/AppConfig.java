package com.coforge.confg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Value("101")
	int id; 
	@Value("${name}")
	String name;
	@Value("${serial}")
	int serial;
	@Bean
	public Model getModel() {
		return new Model();
	}
}
