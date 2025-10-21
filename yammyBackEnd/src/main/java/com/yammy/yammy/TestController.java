package com.yammy.yammy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 이 클래스가 REST API의 요청을 처리하는 컨트롤러임을 명시합니다.
@RestController
public class TestController {

    // 루트 경로 ("/")로 GET 요청이 오면 이 메서드가 실행됩니다.
    @GetMapping("/")
    public String home() {
        return "Yammy Project Backend is Running Successfully! (CI/CD Test Ready)";
    }
}