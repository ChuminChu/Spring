package javapractice;

public class MemberResponse {
    private String loginId;
    private String username;

    //member 생성자 / member에 의존할 수 있다.
    //즉, member만 적어도
    public MemberResponse(Member member){
        this.loginId = member.getId();
        this.username = member.getNickname();
    }

    public MemberResponse(String loginId, String username) {
        this.loginId = loginId;
        this.username = username;
    }
}
