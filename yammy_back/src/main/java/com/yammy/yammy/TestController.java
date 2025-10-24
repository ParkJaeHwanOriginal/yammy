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
                        box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);
                        background-color: #ffffff;
                    }
                    h1 {
                        color: #1976D2; /* 파란색 */
                        border-bottom: 2px solid #1976D2;
                        padding-bottom: 10px;
                    }
                    p {
                        color: #555;
                        line-height: 1.6;
                        margin-top: 20px;
                    }
                    .status-box {
                        background-color: #e3f2fd; /* 연한 파란색 배경 */
                        color: #1565C0;
                        padding: 15px;
                        border-radius: 5px;
                        margin-top: 20px;
                        font-size: 1.2em;
                        font-weight: bold;
                        animation: pulse 1.5s infinite;
                    }
                    @keyframes pulse {
                        0% { transform: scale(1); }
                        50% { transform: scale(1.02); }
                        100% { transform: scale(1); }
                    }
                    .success-message {
                        color: #388E3C; /* 진한 초록색 */
                        font-weight: bold;
                        margin-bottom: 15px;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>🎉 Yammy Project Backend Status</h1>
                    
                    <p class="status-box">
                        서버 상태: **CI/CD 자동 배포 성공!**
                    </p>

                    <p class="success-message">
                        GitHub Actions 파이프라인이 정상적으로 작동하여, 
                        새로운 Docker 이미지가 EC2 서버에 성공적으로 반영되었습니다.
                    </p>
                    
                    <p>
                        <b>목표:</b> 견고한 CI/CD 환경 구축 완료!
                    </p>
                    
                    <hr>
                    <small>최종 빌드 환경: Spring Boot v3.5.6, Java 17</small>
                </div>
            </body>
            </html>
            """;
    }
}
