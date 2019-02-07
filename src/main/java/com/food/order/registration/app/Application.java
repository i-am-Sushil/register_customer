package com.food.order.registration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = { "com.food.order.registration" })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	

	/*@Bean
	public DataSource dataSource() {
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ms";
		String username = "root";
		String password = "pass";
		System.out.println(driverClass + " " + url + " " + username + " " + password);
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName(driverClass);
		source.setUrl(url);
		source.setUsername(username);
		source.setPassword(password);
		return source;
	}*/
}

