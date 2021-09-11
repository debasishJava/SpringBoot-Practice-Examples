package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.coforge.confg.AppConfig;
import com.coforge.confg.Model;

@SpringBootApplication
public class BeanConfgAndCompApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(BeanConfgAndCompApplication.class, args);
		AppConfig ag=ac.getBean("appConfig", AppConfig.class);
		
		Model m=ag.getModel();
		m.msg();
	}

}
