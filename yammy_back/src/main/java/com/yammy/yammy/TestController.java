package com.yammy.yammy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // 루트 경로 ("/")로 GET 요청이 오면 이 메서드가 실행됩니다.
    @GetMapping("/")
    public String home() {
        // HTML과 CSS 스타일을 인라인으로 사용하여 메시지를 꾸밉니다.
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Yammy Backend Status</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        text-align: center;
                        margin-top: 50px;
                        background-color: #f4f4f9;
                    }
                    .container {
                        max-width: 600px;
                        margin: 0 auto;
                        padding: 20px;
                        border-radius: 10px;
                        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                        background-color: #ffffff;
                    }
                    h1 {
                        color: #4CAF50; /* 초록색 */
                        border-bottom: 2px solid #4CAF50;
                        padding-bottom: 10px;
                    }
                    p {
                        color: #555;
                        line-height: 1.6;
                        margin-top: 20px;
                    }
                    .status-box {
                        background-color: #e8f5e9; /* 연한 초록색 배경 */
                        padding: 15px;
                        border-radius: 5px;
                        margin-top: 20px;
                        font-weight: bold;
                    }
                    .error {
                        color: #f44336; /* 빨간색 */
                        font-style: italic;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>✅ Yammy Project Backend Status</h1>
                    
                    <p class="status-box">
                        서버 상태: **Running Successfully!**
                    </p>

                    <p>
                        <b>목표:</b> CI/CD (배포 자동화) 연습중입니다!
                    </p>
                    
                    <p class="error">
                        ❌ 깃헙 액션 문제점: 현재 GitHub Actions 실행은 확인되었으나,
                        자동 배포(Deploy) 단계에서 설정 문제로 인해 최종 반영이 안 되고 있습니다.
                        (Gradle 권한, EC2 경로, 포트 설정은 모두 확인되었습니다.)
                    </p>
                    <hr>
                    <small>최종 빌드 환경: Spring Boot v3.5.6, Java 17</small>
                </div>
            </body>
            </html>
            """;
    }
}