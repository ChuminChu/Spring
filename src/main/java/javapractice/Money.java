package javapractice;

public class Money {
    private int money;

    public Money(int money) {
        if(money < 0){
            //에러발생
        }
        this.money = money;
    }
}
