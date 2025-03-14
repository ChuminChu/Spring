package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        if (name.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 10글자를 넘어갈 수 없습니다.");
        }
        this.name = name;
    }

    public Car(String name, int position) {
        if (name.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 10글자를 넘어갈 수 없습니다.");
        }
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    //근데 또 이렇게 쓰면 차 3대에 대한 정보는 안주고 하나에 대한 것만 주니까 이 함수만 Cars로 옮기자
//    public List<String> print() {
//        String print = "-";
//        List<String> carMove = new ArrayList<>();
//
//        carMove.add(this.getName() + " 🚗" + print.repeat(positionPlus(this)));
//        return carMove;
//    }

    public static int positionPlus(Car car) {
        if (generationRandomNum() >= 3) {
            car.setPosition(car.getPosition() + 1);
        }
        return car.getPosition();
    }

    // 1. 랜덤수 발생
    private static int generationRandomNum() {
        Random random = new Random();
        int num = random.nextInt(1, 7);
        return num;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
