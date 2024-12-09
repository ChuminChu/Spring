package javapractice;

import java.util.Objects;

public class BankAccount {
    String accountNumber;
    Money balance;
    String owner;

    public BankAccount(String accountNumber, Money balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    /*
          public void deposit (int amount){
                if(amount < 0){
                    //예외처리
                    throw new IllegalArgumentException("[ERROR] 넣을 돈이 없습니다.");
                }  balance = balance + amount;
            }
            */
    public void deposit (Money amount){
        balance = balance.plus(amount);
    }

 /*   public void withdraw (int amount){
        if(balance < amount){
            throw new IllegalArgumentException("[ERROR] 잔고보다 출금할 돈이 더 많습니다.");
        } balance = balance - amount;
    }*/


    public void withdraw (Money amount){
        balance = balance.minus(amount);
    }

}
