package racing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void carsMove() {
        //given - 차 이름, 이동수 리스트를 cars리스트에 담기
        List<Car> cars = List.of(
                new Car("Hyundai" , 3),
                new Car("Porsche",2),
                new Car("Toyota",1)
        );

        //when - 이동하는 함수
        List<String> 이동된차들 = vprint(cars);

        //then
        List<String> 원하는결과 = List.of("Hyundai ---", "Porsche --", "Toyota -");
        assertThat(이동된차들).isEqualTo(원하는결과);

    }

    private List<String> vprint(List<Car> cars) {
        // 1. 차 한개의 이름과 이동수를 읽어와서
        // 2. 그걸 3번 반복해 ??

        // - 차의 이동수 만큼 "-"를 붙여줘
        String print = "-";
        List<String> 이동된차_짝대기표시 = new ArrayList<>();

        for (Car car : cars) {
            이동된차_짝대기표시.add(car.getName() + " " + print.repeat(car.getPosition()));
        }
        return 이동된차_짝대기표시;
    }

   /* @Test
    void CarsClassTest() {
        //given - 차 이름, 이동수 리스트를 cars리스트에 담기
        List<Car> cars = List.of(
                new Car("Hyundai" , 3),
                new Car("Porsche",2),
                new Car("Toyota",1)
        );

        Cars carsList = new Cars(cars);

        //when - 이동하는 함수
        //List<String> 이동된차들 = moveCars(cars);
        //void로 바껴서,,, 실행 불가능
        //List<String> cars1 = carsList.print();

        //then
        List<String> 원하는결과 = List.of("Hyundai ---", "Porsche --", "Toyota -");
        assertThat(cars1).isEqualTo(원하는결과);

    }*/

}
