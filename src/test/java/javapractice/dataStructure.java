package javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
public class dataStructure {
    @Test
    void DataStructure() {
        //ArrayList 오브젝트를 하나 만들어서 광역시목록이라는 이름의 변수에게 기억시켜 보세요.
        ArrayList<String> 광역시목록 = new ArrayList<>();

        //위에서 만든 광역시목록(이 기억하고 있는 오브젝트)에 도시 이름 네 개(대전, 일산, 광주, 울산) 추가해 보세요.  (add() 메서드 이용)
        광역시목록.add("대전");
        광역시목록.add("일산");
        광역시목록.add("광주");
        광역시목록.add("울산");

        //광역시목록에 추가된 도시가 몇 개인지 출력해 주세요.
        System.out.println(광역시목록.size()); //4

        //광역시목록의 두 번째 도시를 출력해 주세요.
        System.out.println(광역시목록.get(1));

        //반복문을 사용하여 광역시목록의 모든 도시를 출력해 주세요.
        for(String 광역시 : 광역시목록){
            System.out.println("광역시목록 =" + 광역시);
            //광역시목록 =대전
            //광역시목록 =일산
            //광역시목록 =광주
            //광역시목록 =울산
        }



    }



}
