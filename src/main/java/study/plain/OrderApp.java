package study.plain;

import study.plain.member.Grade;
import study.plain.member.Member;
import study.plain.member.MemberService;
import study.plain.member.MemberServiceImpl;
import study.plain.order.Order;
import study.plain.order.OrderService;
import study.plain.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "tester", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 100000);

        System.out.println("order = " + order);
    }
}
