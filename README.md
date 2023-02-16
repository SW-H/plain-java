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

+ 주문 도메인 협력, 역할, 책임
 ![Screenshot 2023-02-16 at 5.13.43 PM.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fqg%2Fdz404lcn62l47j3d00y7c9gw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_smnfdg%2FScreenshot%202023-02-16%20at%205.13.43%20PM.png)
![Screenshot 2023-02-16 at 5.14.17 PM.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fqg%2Fdz404lcn62l47j3d00y7c9gw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_UANzkg%2FScreenshot%202023-02-16%20at%205.14.17%20PM.png)

+ 주문 클래스 다이어그램
![Screenshot 2023-02-16 at 5.15.13 PM.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fqg%2Fdz404lcn62l47j3d00y7c9gw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_Nw0TgC%2FScreenshot%202023-02-16%20at%205.15.13%20PM.png)

+ 주문 객체 다이어그램
![Screenshot 2023-02-16 at 5.15.22 PM.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fqg%2Fdz404lcn62l47j3d00y7c9gw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_DjqTzm%2FScreenshot%202023-02-16%20at%205.15.22%20PM.png)
![Screenshot 2023-02-16 at 5.15.42 PM.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fqg%2Fdz404lcn62l47j3d00y7c9gw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_tsZ8c8%2FScreenshot%202023-02-16%20at%205.15.42%20PM.png)