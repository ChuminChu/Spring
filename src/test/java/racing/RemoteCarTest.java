package racing;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoteCarTest {
    @Test
    void wintest() {
        //given
        List<Car> cars = List.of(
                new Car("a" , 3),
                new Car("b" , 2),
                new Car("c" , 4)
        );

        //when
        List<Car> 위치가큰차 = gameOver(cars);

        //
        List<Car> 원하는결과 = List.of(new Car("c" ,4));
        assertThat(위치가큰차).isEqualTo(원하는결과);
    }

    private List<Car> gameOver(List<Car> cars) {
        List<Integer> remoteCar = cars.stream().map((carPosition) -> carPosition.getPosition()).toList();

        int winCar = Collections.max(remoteCar);

        return cars.stream().filter((carPosition) -> carPosition.getPosition() == winCar).toList();
    }
}
