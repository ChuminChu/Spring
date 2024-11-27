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

}
