package javapractice;

public class Member {
    private String id;
    private String nickname;
    private String password;

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public Member(String id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }
}
