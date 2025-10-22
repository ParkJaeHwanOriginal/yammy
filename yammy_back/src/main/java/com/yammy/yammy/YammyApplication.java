package com.yammy.yammy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // <--- 이 부분을 추가합니다.
@SpringBootApplication() // <--- 이 부분을 추가합니다.
public class YammyApplication {

	public static void main(String[] args) {
		SpringApplication.run(YammyApplication.class, args);
	}

}
