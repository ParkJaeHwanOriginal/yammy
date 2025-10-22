package com.yammy.yammy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 이 클래스가 REST API의 요청을 처리하는 컨트롤러임을 명시합니다.
@RestController
public class TestController {

    // 루트 경로 ("/")로 GET 요청이 오면 이 메서드가 실행됩니다.
    @GetMapping("/")
    public String home() {
        return "Yammy Project Backend is Running Successfully! (CI/CD Test Ready)" +
                "배포자동화를 위해 연습중입니다!" +
                "깃헙 액션 추가" +
                "왜 추가가 안될까?" +
                "빌드 위치 수정까지 했음" +
                "dhodfaskflkdsjfkljsldkfjsdf";
    }
}