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

## 설계

+ 회원 도메인 협력 관계
<img width="814" alt="Screenshot 2023-02-15 at 10 35 02 PM" src="https://user-images.githubusercontent.com/49016275/219041875-3ec25bfe-e61b-4af0-a006-8ba37d4a17d0.png">
  
+ 회원 클래스 다이어그램

<img width="815" alt="Screenshot 2023-02-15 at 10 36 24 PM" src="https://user-images.githubusercontent.com/49016275/219042200-8016dfb6-d1b2-4d9b-a809-6982d22c45db.png">

+ 회원 객체 다이어그램
<img width="816" alt="Screenshot 2023-02-15 at 10 36 41 PM" src="https://user-images.githubusercontent.com/49016275/219042261-d0849fb9-55c4-437c-9fdd-1b76b0b6f965.png">
