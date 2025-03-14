package racing;

import java.util.*;


public class Application {

    public static void main(String[] args) {
        System.out.println("부릉아 달려보자!");

        //자동차 입력받기
        List<Car> gameCars = CarsUserInput.getInputCar();

        //이 출력이 좀,,,, 고칠 필요가 있음..
        for (Car gameCar : gameCars) {
            System.out.print(gameCar.getName());
        }

        //시행 횟수
        int count = NumUserInput.getInputUser();

        // 1. Cars의 이름과 위치를 받자
        Cars cars = new Cars(gameCars);

        //전체 반복 횟수
        for (int i = 1; i < count+1; i++) {
            //출력
            System.out.println("(" + i +") 회");
            cars.print();
            System.out.println(" ");
        }
        GameOver.remoteCar(cars);
    }






    /* 이걸 쓰다보니까 랜덤수가 3보다 크면 차량을 이동을 해야되는데 이동시킬 함수는 Cars안에 있어서 이 함수에 가져오기가 쉽지 않음 그래서 그냥 Cars안으로 옮기면 더 편하게 쓸 수 있지 않을까?
    private static String print(){
        if(generationRandomNum() > 3){

        }
    }

    //랜덤수 발생
    private static int generationRandomNum() {
        Random random = new Random();
        int num = random.nextInt(1,7);
        return num;
    }
    */


}
