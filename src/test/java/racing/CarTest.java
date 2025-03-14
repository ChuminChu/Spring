package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    void CarTest() {
        //차 이름 하나를 입력받는 클래스를 만들기
        Car car = new Car("car");
        assertThat(car.getName()).isEqualTo("car");

        //예외처리 통과하는 함수 어케 짜지..
//        assertThatThrownBy(() -> car.getName().equals("bike")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void CarMoveTest() {
        //given
        Car car = new Car("Hyundai", 3); //차량이름

        //when - 차가 움직인다.
        String carMove = move(car, 3);
        //움직이는 횟수

        //then
        String 원하는결과 = "Hyundai ---";
        assertThat(carMove).isEqualTo(원하는결과);
    }

    private String move(Car car, int a) {
        String print = "-";
        return car.getName() + " " +print.repeat(a);
    }



}
