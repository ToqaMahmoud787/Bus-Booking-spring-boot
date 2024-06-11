package com.swvl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AdminService {

	public static void main(String[] args) {
		SpringApplication.run(AdminService.class, args);
	}
}

