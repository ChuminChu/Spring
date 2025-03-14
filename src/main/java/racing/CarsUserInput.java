package racing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarsUserInput {
    private String carsNameInput;

    public CarsUserInput(String carsNameInput) {
        this.carsNameInput = carsNameInput;
    }

    //차 이름 입력받기
    private static List<String> getInputStringCar() {
        System.out.println("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String gameCars= scanner.nextLine();
        return Arrays.asList(gameCars.split(","));
    }

    //String으로 받은 gameCars들을 쉼표로 구분해 새로운 List<Car>로 만듦
    public static List<Car> getInputCar() {
        //이 함수 안에는 List<String> 의 값이 있어 이거를 List<Car>로 바꿔줄거야
        return getInputStringCar().stream()
                .map((gameCar) -> new Car(gameCar)).toList();
    }


}
