package javapractice;

import com.jayway.jsonpath.internal.function.numeric.Max;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ListFunction {

    @Test
    void ListFuctionTest() {
        assertThat(getSum(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))).isEqualTo(10);
        assertThat(getSum(new ArrayList<>(Arrays.asList(7)))).isEqualTo(7);
        assertThat(getSum(new ArrayList<>())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return

        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
        assertThat(getSum(List.of(7))).isEqualTo(7);
        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return

        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return

        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
        assertThat(findMax(List.of(7))).isEqualTo(7);

        assertThat(findMin(List.of(3, 10, 5, 4, 7))).isEqualTo(3);
        assertThat(findMin(List.of(7))).isEqualTo(7);

        assertThat(isPass(List.of(60, 60))).isTrue();
        assertThat(isPass(List.of(40, 80))).isTrue();
        assertThat(isPass(List.of(39, 100, 100))).isFalse();
        assertThat(isPass(List.of(100, 0, 100))).isFalse();

        assertThat(getIntegersBetween(1, 5)).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(getIntegersBetween(-3, 1)).isEqualTo(List.of(-3, -2, -1, 0, 1));
        assertThat(getIntegersBetween(3, 3)).isEqualTo(List.of(3));
        //assertThat(getIntegersBetween(5, 1)).containsExactlyInAnyOrder(5, 4, 3, 2, 1);

        assertThat(filterPositive(List.of(-1, 2, -3, 4, 0))).isEqualTo(List.of(2, 4));
        assertThat(filterPositive(List.of(-1, -2, -3))).isEqualTo(List.of());
        assertThat(filterPositive(List.of())).isEqualTo(List.of());

        assertThat(findPassedStudents(List.of(70, 85, 90, 75, 80))).isEqualTo(List.of(85, 90, 80));
        assertThat(findPassedStudents(List.of(70, 75, 79))).isEqualTo(List.of());
        assertThat(findPassedStudents(List.of(80, 85, 90))).isEqualTo(List.of(80, 85, 90));

        /*assertThat(removeDuplicates(List.of(1, 2, 2, 3, 4, 4, 5))).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(removeDuplicates(List.of(1, 1, 1, 1))).isEqualTo(List.of(1));
        assertThat(removeDuplicates(List.of())).isEqualTo(List.of());*/
    }

    //합 구하기
//    int getSum(ArrayList<Integer> numbers){
//        int sum = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            sum = sum + numbers.get(i);
//        }
//        return sum;
//    }
    int getSum(List<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum;
    }

    //평균 구하기
    double getAverage(List<Integer> num){
        if(num.size() == 0){
            return (double) 0.0;
        }
        //값 나누기
        return (double) getSum(num) / num.size();
        //size가 0일때 나누는 거 따로 빼기


    }

    //최대값 구하기
    int findMax(List<Integer> num){
        int max = num.get(0); //1이 가장 크다는 가정
//        int max = Integer.MIN_VALUE; //1이 가장 크다는 가정
        for (Integer i : num) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    //최솟값 구하기
   int findMin(List<Integer> num) {
        int min = num.get(0);
        for (Integer i : num) {
           if(i < min){
               min = num.get(i);
           }
       }
        return min;
   }

   //여러 과목 시험 합격/불합격 판단
    boolean isPass(List<Integer> score){
        for (Integer num : score) {
            if( num < 40){
                return false;
            }
        }
        if(getAverage(score) < 60 ){
            return false;
        }
        return true;
    }

    //두 정수 사이의 정수 구하기??
    List<Integer> getIntegersBetween(int a, int b){
        //내가 두사이의 정수를 구해서 넣을 리스트가 필요함
        ArrayList<Integer> betweenNum = new ArrayList<>();
        if (a < b){
            for (int i = a; i <= b; i++) {//a부터b까지
                betweenNum.add(i);//i를 추가해라
            }
        } else { //a>=b
            for (int i = b; i <= a; i++) {
                betweenNum.add(i);
            }
        }
        return betweenNum;
    }

    //양수필터링
    List<Integer> filterPositive(List<Integer> integers){
        //내가 양수를 넣을 리스트 설정 - 숫자가 많아지면 리스트로 뽑아내야함 / int로 사용해서 하나로 뽑을 수 없음
        ArrayList<Integer> positive = new ArrayList<>();
        for (Integer i : integers) { //이것도 잘 모르겠뜸ㅠㅠㅠ
            if(i > 0){
                positive.add(i);
            }
        }
        return positive;

    }

    //합격생 필터링
    List<Integer> findPassedStudents(List<Integer> score){
        ArrayList<Integer> finalScore = new ArrayList<>();
        for (Integer i : score) {
            if(i >= 80){
                finalScore.add(i);
            }
        }
        return finalScore;
    }

    //리스트 중복 제거 - 는 모르겠다

    /*List<Integer> removeDuplicates(List<Integer> num){
        ArrayList<Integer> remove = new ArrayList<>();
        for (Integer i : num) {
            if(!remove.contains(i)){

            }
        }
        return remove;
    }*/



}
