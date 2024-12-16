package com.userrest.call.UserRestCall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserRestCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestCallApplication.class, args);
	}

}
