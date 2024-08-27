## 프로젝트 개요

로우메이트(Lawmate) 프로젝트는 현대 사회에서 발생하는 법률 정보 격차를 해소하기 위해 설계된 플랫폼입니다. 인공지능 기반의 24시간 무료 법률 상담 서비스를 제공하여, 복잡한 법률 용어와 판례를 쉽게 이해할 수 있게 돕는 것을 목표로 합니다. 또한, 상담 내용을 기반으로 사용자에게 최적의 변호사를 매칭해주며, 변호사 인증 시스템을 통해 신뢰할 수 있는 법률 전문가를 소개합니다. 이를 통해 사용자는 법률 자문 비용을 절감하고, 법률 서비스의 접근성과 효율성을 높일 수 있습니다.



### 주요 기능

- AI 법률 상담
- 변호사 선임 및 상담 예약 서비스
- 실시간 채팅 및 알림
- 데이터 기반 변호사 추천 시스템



### 기술 스택

- **백엔드**: Java 17, Spring Boot, Spring Cloud, Spring Security, JPA, Redis, MySQL, MongoDB
- **프론트엔드**: React, Next.js, TypeScript
- **DevOps & CI/CD**: Naver Cloud, Docker, Kubernetes, Jenkins, GitHub


### 담당 파트
<img src="https://github.com/user-attachments/assets/60435f21-a227-4acd-b040-3ee531d11f5d" alt="OAuth" width="400"/>

- **OAuth**: Google OAuth 2.0을 통해 회원가입 및 로그인 기능 구현
- **결제**: PortOne API를 통해 상품 결제 및 취소, 구독 기능 구현
- **알림**: SSE를 활용하여 실시간 알림 전송 및 조회
- **게시판**: 질문게시판 CRUD

## 프로젝트 구조

### 마이크로서비스 아키텍처
<img src="https://github.com/user-attachments/assets/55de0960-adf9-488c-b5e1-cbb82055b983" alt="MSA" width="400"/>
<img src="https://github.com/user-attachments/assets/d4259225-9409-4baa-b3ae-3d535e4dfddb" alt="Architecture" width="400"/>

### CI/CD 파이프라인 구축
<img src="https://github.com/user-attachments/assets/c64c5a1a-0346-4d92-b6fc-29218c99d21d" alt="CICD" width="400"/>
