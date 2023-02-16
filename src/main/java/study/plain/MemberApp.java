package study.plain;

import ch.qos.logback.core.net.SyslogOutputStream;
import study.plain.member.Member;
import study.plain.member.Grade;
import study.plain.member.MemberService;
import study.plain.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "tester", Grade.VIP);
        memberService.join(member);

        Member foundMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("found member = " + foundMember.getName());

    }
}
