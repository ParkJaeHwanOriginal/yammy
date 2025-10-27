package com.yammy.yammy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // 루트 경로 ("/")로 GET 요청이 오면 이 메서드가 실행됩니다.
    @GetMapping("/")
    public String home() {
        // 퍼플랙시티 UI 분위기의 심플/모던 HTML, 색상·컴포넌트 재배치
        return """
        <!DOCTYPE html>
        <html lang="ko">
        <head>
            <meta charset="UTF-8">
            <title>Yammy Backend Status</title>
            <style>
                body {
                    background: #fafbfc;
                    font-family: 'Inter', 'Pretendard', Arial, sans-serif;
                    margin: 0;
                    padding: 0;
                    min-height: 100vh;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                }
                .card {
                    background: #fff;
                    box-shadow: 0 2px 16px rgba(38, 50, 56, .08), 0 1.5px 8px rgba(36, 49, 60, .05);
                    border-radius: 14px;
                    max-width: 420px;
                    width: 100%;
                    padding: 36px 32px 30px 32px;
                    text-align: center;
                }
                .card h1 {
                    font-size: 2rem;
                    font-weight: 700;
                    color: #212e41;
                    margin-bottom: 8px;
                    margin-top: 0;
                }
                .yammy-status {
                    font-size: 1.15em;
                    font-weight: 600;
                    color: #23A6FF;
                    background: #E4F3FF;
                    border-radius: 8px;
                    padding: 10px 0;
                    margin: 22px 0 0px 0;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                }
                .yammy-status .icon {
                    font-size: 1.4em;
                    margin-right: 8px;
                }
                .success {
                    color: #2CB67D;
                    font-weight: 500;
                    margin: 16px 0 0 0;
                    font-size: 1em;
                }
                .details {
                    font-size: 0.95em;
                    color: #52616B;
                    margin: 24px 0 14px 0;
                }
                .goal {
                    background: #F1F7FF;
                    color: #0087FF;
                    border-radius: 6px;
                    padding: 8px 0;
                    margin: 10px 0 24px 0;
                    font-weight: 500;
                }
                .footer {
                    font-size: 0.9em;
                    color: #919191;
                    margin-top: 22px;
                }
            </style>
        </head>
        <body>
            <div class="card">
                <h1>Yammy 프로젝트 백엔드</h1>
                <div class="yammy-status"><span class="icon">🟢</span>CI/CD 자동 배포 완료</div>
                <div class="success">
                    GitHub Actions 파이프라인이 정상적으로 작동하여<br>
                    새로운 Docker 이미지가 EC2 서버에 안전하게 반영됨.
                </div>
                <div class="goal">
                    목표: 견고하고 자동화된 CI/CD 환경 구축!
                </div>
                <div class="details">
                    <span>Spring Boot v3.5.6, Java 17 서버 빌드</span>
                </div>
                <div class="footer">
                    © 2025 Yammy Team
                </div>
            </div>
        </body>
        </html>
        """;
    }

}
