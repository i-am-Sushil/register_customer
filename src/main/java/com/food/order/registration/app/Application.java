package com.food.order.registration.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
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

@RestController
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
