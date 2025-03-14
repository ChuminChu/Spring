package javapractice;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MemberTest {

    @Test
    void membertest(){
        Member member1 = new Member("id", "nickname", "password");
        //member생성자가 없을 때
        MemberResponse memberResponse1 = new MemberResponse(member1.getId(), member1.getNickname());
        //member 생성자가 있을 때
        MemberResponse memberResponse2 = new MemberResponse(member1);


    }

    @Test
    void memberListTest(){
        List<Member> memberList = List.of(
                new Member("id2", "nickname2", "password2"),
                new Member("id3", "nickname3", "password3"),
                new Member("id4", "nickname4", "password4"));

        ArrayList<MemberResponse> memberResponseList = new ArrayList<>();
        for (Member member : memberList) {
            //member생성자가 없을 때
            memberResponseList.add(new MemberResponse(member.getId(), member.getNickname()));
            //member생성자가 있을 때
            memberResponseList.add(new MemberResponse(member));
        }
        //for문 대신
        List<MemberResponse> responses = memberList.stream()
                .map((member) -> new MemberResponse(member))
                .toList();
    }

    @Test
    void MemberListFilterTest(){
        List<Member> memberList = List.of(
                new Member("id2", "nickname2", "password2"),
                new Member("id3", "", "password3"),
                new Member("id4", "", "password4"));

       List<MemberResponse> responses2 = memberList.stream()
               .filter( (member) -> member.getNickname().isEmpty())
               .map((member) -> new MemberResponse(member))
               .toList();
    }

}
