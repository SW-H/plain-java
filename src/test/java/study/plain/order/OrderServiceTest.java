package study.plain.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.plain.member.Grade;
import study.plain.member.Member;
import study.plain.member.MemberService;
import study.plain.member.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "tester", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
