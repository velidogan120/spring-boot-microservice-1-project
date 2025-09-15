package org.sha.springbootmicroservice1project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicroservice1ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice1ProjectApplication.class, args);
	}

}
