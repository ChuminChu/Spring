package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameOver {

    public static void remoteCar(Cars cars) {
        // 1. 차들의 위치만 구하기
        List<Integer> carPosition = cars.getCars().stream().map((carposition) -> carposition.getPosition()).toList();

        // 2. 위치들 중에 가장 큰 값 고르기
        int win = Collections.max(carPosition);

        // 3. 큰 값과 일하는 Cars의 목록을 빼내라
        List<Car> winCar = cars.getCars().stream()
                .filter((position)-> position.getPosition() == win)
                .toList();

        //GameOver로 이동해라
        GameOver.setGameOver(winCar);
    }

    public static void setGameOver(List<Car> winCar){
        List<String> winner = winCar.stream().map((name)-> name.getName()).toList();
        System.out.println("\uD83C\uDFC6우승 차는 " + winner+ "입니다!");
    }
}
