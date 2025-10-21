package com.yammy.yammy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Spring Security 자동 설정을 비활성화하기 위해 임포트합니다.
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // 이 부분을 수정하세요.
public class YammyApplication {

	public static void main(String[] args) {
		SpringApplication.run(YammyApplication.class, args);
	}

}
