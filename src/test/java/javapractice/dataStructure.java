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

        //광역시목록의 "광주"를 "전라도 광주"로 수정해 주세요.
        //set() 메서드를 사용해 보세요.
        광역시목록.set(2,"전라도 광주");
        System.out.println(광역시목록);

        //광역시목록에서 "일산"을 제거해 주세요.
        //remove() 메서드를 사용해 보세요.
        광역시목록.remove(1);
        System.out.println(광역시목록);

        //새로운 ArrayList 오브젝트를 만들고 변수 광역시목록2에게 기억시키세요.
        //그리고 광역시목록의 모든 데이터에 "광역시"를 붙여 광역시목록2에 추가하세요.
        //광역시목록2의 add() 메서드를 사용해 보세요.
        ArrayList<String> 광역시목록2 = new ArrayList<>();
        광역시목록2.addAll(광역시목록); //광역시목록을 광역시목록2에 복붙

        for (int i = 0; i < 광역시목록.size(); i++) { //광역시목록의 길이만큼 반복한다.
            광역시목록2.set(i, 광역시목록.get(i)+"광역시"); //광역시목록2를 수정한다. 광역시목록을 읽어와서 거기서 광역시만 붙여주면 된다.
        }
        //fori + enter하면 자동완성


//        for (String city : 광역시목록2) { // 광역시목록2에 있는 목록들이 알아서 city로 저장되게된다.
//
//        }//광역시목록2.for + 엔터 하면 자동완성

        System.out.println(광역시목록2);

    }



}
