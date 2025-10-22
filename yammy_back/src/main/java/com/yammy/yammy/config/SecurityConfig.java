package com.yammy.yammy.config;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import org.springframework.security.web.SecurityFilterChain;



@Configuration

@EnableWebSecurity

public class SecurityConfig {



    /**

     * HTTP 보안 규칙을 정의하는 SecurityFilterChain Bean을 생성합니다.

     */

    @Bean

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http

                .authorizeHttpRequests(auth -> auth

// 루트 경로 ('/')를 포함한 모든 요청(anyRequest)은 반드시 인증(로그인)되어야 접근 가능합니다.

                                .anyRequest().authenticated()

                )

// 폼 기반 로그인 설정을 활성화합니다.

                .formLogin(form -> form

// 로그인 페이지 및 처리 URL은 Spring Security가 자동으로 제공합니다.

                                .permitAll() // 로그인 페이지 접근은 모두 허용

                )

// 로그아웃 설정을 활성화합니다.

                .logout(logout -> logout

                        .permitAll() // 로그아웃 URL 접근 허용

                        .logoutSuccessUrl("/") // 로그아웃 성공 후 루트 페이지로 리다이렉트

                );



        return http.build();

    }



    /**

     * 임시 사용자 정보를 메모리(InMemory)에 저장하여 인증에 사용합니다.

     * 실제 DB 연동 시에는 Custom UserDetailsService를 구현해야 합니다.

     */

    @Bean

    public UserDetailsService userDetailsService() {

// 테스트용 계정: username = user, password = password

// {noop} 접두사는 PasswordEncoder를 사용하지 않고 평문 비밀번호를 사용함을 의미합니다. (개발/테스트용)

        UserDetails user = User.withDefaultPasswordEncoder()

                .username("user")

                .password("password")

                .roles("USER") // 사용자에게 'USER' 역할을 부여

                .build();



        return new InMemoryUserDetailsManager(user);

    }

}