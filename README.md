스프링 학습 전 순수 자바로만 개발을 진행한 것으로 간단한 주문 서비스입니다.

## 비즈니스 요구사항
+ 회원
  + 회원을 가입하고 조회할 수 있다.
  + 회원은 일반과 VIP 두 가지 등급이 있다.
  + 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다. (미확정)
  
+ 주문과 할인 정책
  + 회원은 상품을 주문할 수 있다.
  + 회원 등급에 따라 할인 정책을 적용할 수 있다.
  + 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용해달라. (나중에 변경 될 수 있다.)
  + 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 
  최악의 경우 할인을 적용하지 않을 수 도 있다. (미확정)

## 설계 - 1. 회원

+ 회원 도메인 협력 관계
<img width="814" alt="Screenshot 2023-02-15 at 10 35 02 PM" src="https://user-images.githubusercontent.com/49016275/219041875-3ec25bfe-e61b-4af0-a006-8ba37d4a17d0.png">
  
+ 회원 클래스 다이어그램
<img width="815" alt="Screenshot 2023-02-15 at 10 36 24 PM" src="https://user-images.githubusercontent.com/49016275/219042200-8016dfb6-d1b2-4d9b-a809-6982d22c45db.png">

+ 회원 객체 다이어그램
<img width="816" alt="Screenshot 2023-02-15 at 10 36 41 PM" src="https://user-images.githubusercontent.com/49016275/219042261-d0849fb9-55c4-437c-9fdd-1b76b0b6f965.png">

## 설계 - 2. 주문
![Screenshot 2023-03-23 at 11.46.15 AM.png](..%2F..%2FDownloads%2FScreenshot%202023-03-23%20at%2011.46.15%20AM.png)

+ 주문 도메인 협력, 역할, 책임
![Screenshot 2023-03-23 at 11.45.27 AM.png](..%2F..%2FDownloads%2FScreenshot%202023-03-23%20at%2011.45.27%20AM.png)
1.   주문 생성: 클라이언트는 주문 서비스에 주문 생성을 요청한다.
2.   회원 조회: 할인을 위해서는 회원 등급이 필요하다. 그래서 주문 서비스는 회원 저장소에서 회원을 조회한다.
3.   할인 적용: 주문 서비스는 회원 등급에 따른 할인 여부를 할인 정책에 위임한다. 
4.   주문 결과 반환: 주문 서비스는 할인 결과를 포함한 주문 결과를 반환한다.


+ 주문 클래스 다이어그램
![Screenshot 2023-03-23 at 11.46.31 AM.png](..%2F..%2FDownloads%2FScreenshot%202023-03-23%20at%2011.46.31%20AM.png)
+ 주문 객체 다이어그램
![Screenshot 2023-03-23 at 11.46.44 AM.png](..%2F..%2FDownloads%2FScreenshot%202023-03-23%20at%2011.46.44%20AM.png)
![Screenshot 2023-03-23 at 11.46.37 AM.png](..%2F..%2FDownloads%2FScreenshot%202023-03-23%20at%2011.46.37%20AM.png)
