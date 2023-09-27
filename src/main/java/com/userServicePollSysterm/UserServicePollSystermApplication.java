package com.userServicePollSysterm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServicePollSystermApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServicePollSystermApplication.class, args);
	}

}
