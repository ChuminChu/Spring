package javapractice;

import java.util.Objects;

public class Money {
    //값포장
    private final int value;

    public Money(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 0 미만일 수 없음");
        }
        this.value = value;
    }

  /*
  //Money끼리 더하는 코드
    public Money mplus(Money amount) {
        return new Money(amount.plus(value));
        //amount.plus(value) = input value라고 생각하기

    }
    */

    public Money plus(Money other) {
        return new Money(this.value + other.value);
    }

    public Money minus(Money other) {
        return new Money(this.value - other.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
    /*
    //int + int
    public int plus(int amount) {
        return value + amount;
        //value 는 내가 입력받을 input타입
    }*/

    /*
    //Money가 들어와서 int로 나가라
    public Money minus(Money amount) {
         return new Money(value);
    }
    */

}
