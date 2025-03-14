package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<Car> cars) {
        if(cars.size() > 3){
            throw new IllegalArgumentException("[ERROR]차가 너무 많으면 사고나요ㅠㅠ 3개까지만 입력해주세요!");
        }
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void print() {
        String print = "-";
        List<String> carMove = new ArrayList<>();

        //차 전진하기
        for (Car car : this.cars) {
            carMove.add(car.getName() + " 🚗" + print.repeat(Car.positionPlus(car)));
        }
        //전진된거 보여주기
        for (int i = 0; i < carMove.size(); i++) {
            System.out.println(carMove.get(i));
        }
    }





/* 이걸 한번에 쓰니까 문제점이 list형태로 묶여있기 때문에 Car클래스에 옮겨놓고 그걸 반복적으로 시행하는 수,,밖에 없는것같다!
    public List<String> print() {
        String print = "-";
        List<String> carMove = new ArrayList<>();

            for (Car car : this.cars) {
                carMove.add(car.getName() + " 🚗" + print.repeat(positionPlus(car)));
            }
            return carMove;

    }

    private static int positionPlus (Car car) {
        if(generationRandomNum() > 3){
            car.setPosition(car.getPosition() + 1);
        }
        return car.getPosition();
    }

    // 1. 랜덤수 발생
    private static int generationRandomNum() {
        Random random = new Random();
        int num = random.nextInt(1,7);
        return num;
    }*/
}
