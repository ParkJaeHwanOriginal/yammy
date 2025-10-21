package com.yammy.yammy.config; // 패키지 이름을 config로 하거나 com.yammy.yammy에 넣으세요.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 설정 클래스임을 명시
@EnableWebSecurity // 스프링 시큐리티 활성화
public class SecurityConfig {

    // 1. 보안 필터 체인 설정 (접근 제어 규칙 정의)
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        // 모든 요청 (/**)은 인증(로그인)이 필요하다고 설정합니다.
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        // 별도 설정 없으면 기본 로그인 페이지 사용
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll());

        return http.build();
    }

    // 2. 임시 사용자 정의 (인메모리 방식)
    @Bean
    public UserDetailsService userDetailsService() {
        // 테스트용 계정: user / password (실제 운영 환경에서는 사용 금지)
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}