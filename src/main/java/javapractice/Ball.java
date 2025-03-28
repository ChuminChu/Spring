package javapractice;

import java.util.Objects;

public class Ball {
    int position;
    int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    //alt+insert -> equals and hashcode()선택
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }
}
