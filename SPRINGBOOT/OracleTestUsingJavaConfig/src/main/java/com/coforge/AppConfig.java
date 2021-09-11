package com.coforge;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	public DriverManagerDataSource ds() {
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("OracleDriver");
		d.setUrl("jdbc:oracle:localhost:1521:xe");
		d.setUsername("scott");
		d.setPassword("tiger");
		return d;
	}
}
