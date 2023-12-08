package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        // AppConfig appConfig = new AppConfig();
      //  MemberService memberService = appConfig.memberService(); // DI

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // 어노테이션 기반 컨피그 Appconfig 클래스를 기반으로 객체생성/관리
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member1 = new Member(1L,"member1", Grade.VIP);
        memberService.join(member1);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = "+member1.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
