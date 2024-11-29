package javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class ListDataPractice {
    @Test
    void listData() {
        ArrayList<String> 한국도시들 = new ArrayList<>();
        한국도시들.add("제주");
        한국도시들.add("강릉");
        한국도시들.add("울산");

        ArrayList<String> 미국도시들 = new ArrayList<>();
        미국도시들.add("디트로이트");
        미국도시들.add("스프링필드");
        미국도시들.add("볼티모어");

        ArrayList<String> 독일도시들 = new ArrayList<>();
        독일도시들.add("프랑크푸르트");
        독일도시들.add("함부르크");
        독일도시들.add("브레멘");

        //위 세 개의 데이터를 묶어서 다시 하나의 데이터로 만들려면 어떻게 해야 할까요?
        ArrayList<ArrayList<String>> 세계도시들 = new ArrayList<>();
        세계도시들.add(한국도시들);
        세계도시들.add(미국도시들);
        세계도시들.add(독일도시들);

        //세계도시들을 몽땅 다 출력하면 그게 어느나라인지 알 수 없으니까 hashMap을 하나 만들어서 어느나라인지 만드는 것.
        HashMap<String, ArrayList<String>> 어느나라 = new HashMap<>();
        어느나라.put("한국", 한국도시들);
        어느나라.put("미국", 미국도시들);
        어느나라.put("독일", 독일도시들);

        //한국 = 한국도시들 -> 한국을 이모지로
        HashMap<String, String> 나라별이모지 = new HashMap<>();
        나라별이모지.put("한국", "❤\uFE0F");
        나라별이모지.put("미국", "⭐");
        나라별이모지.put("독일", "\uD83C\uDF7A");


        //어느나라.entryset().for + 엔터 -> 자동완성
        //키,벨류 둘다 본다는 의미
        for (Map.Entry<String, ArrayList<String>> entry : 어느나라.entrySet()) {
            String 나라이름 = entry.getKey();
            ArrayList<String> 그나라도시들 = entry.getValue();
            //if문을 쓰지 않고 사용하는 방법 -> if문을 대용량으로 쓰지 않아도 데이터로 관리할 수 있음
            String emoji = 나라별이모지.get(나라이름);
            System.out.println(emoji + 그나라도시들);


            /*
            //코치님꺼
            String emoji = "";
            if(나라.equals("한국")){
                emoji = "❤\uFE0F";
            }
            if(나라.equals("미국")){
                emoji = "⭐";
            }
            if(나라.equals("독일")){
                emoji = "\uD83C\uDF7A";
            }

            for (String 도시 : 그나라도시들) {
               System.out.println(emoji + 도시);
            }*/

            //내가 짠거
           /* if (나라.equals("한국")){ System.out.println("❤\uFE0F" + 그나라도시들);
            }
            else if (나라.equals("미국")){ System.out.println("⭐" + 그나라도시들);
            } else { System.out.println("\uD83C\uDF7A" + 그나라도시들);}*/

        }
        //System.out.println(어느나라);
    }

    @Test
    void mapTest() {
        HashMap<String, String> product1 = new HashMap<>();
        product1.put("상품명", "코멧 니트릴장갑 화이트");
        product1.put("상품가격", "6540"); //int로 쓸 수 없는 이유는 해쉬맵 자체에서 value값이 String일때 전체 value값이 String으로 밖에 안되기 때문임
        product1.put("카테고리", "주방용품");

        HashMap<String, String> product2 = new HashMap<>();
        product2.put("상품명", "라운드랩 1025 독도 로션 400ml");
        product2.put("상품가격", "169010");
        product2.put("카테고리", "뷰티");

        HashMap<String, String> product3 = new HashMap<>();
        product3.put("상품명", "삼양 불닭볶음면 큰 컵 105g");
        product3.put("상품가격", "17110");
        product3.put("카테고리", "식품");

        //여러 상품 데이터들을 하나의 데이터로 표현하려면 어떻게 해야 할까요?
        //상품이 여러개 들어있는 리스트를 하나 만든거임
        ArrayList<HashMap<String, String>> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

    }

    @Test
    void test() {
        //각 도시별 인구수 데이터도 함께 표시하려면 어떻게 해야하는지?
        HashMap<String, String> cityPeople1 = new HashMap<>();
        cityPeople1.put("도시명", "제주");
        cityPeople1.put("인구수", "67만명");

        HashMap<String, String> cityPeople2 = new HashMap<>();
        cityPeople2.put("도시명", "강릉");
        cityPeople2.put("인구수", "20만명");

        HashMap<String, String> cityPeople3 = new HashMap<>();
        cityPeople3.put("도시명", "울산");
        cityPeople3.put("인구수", "109만명");

        ArrayList<HashMap<String, String>> totalcity = new ArrayList<>();
        totalcity.add(cityPeople1);
        totalcity.add(cityPeople2);
        totalcity.add(cityPeople3);

        System.out.println(totalcity);
    }


    @Test
    void myContainsTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("하현우");

        boolean 하현우존재여부 = myContains(names, "하현우");
        boolean 잔나비존재여부 = myContains(names, "잔나비");

        assertThat(하현우존재여부).isTrue();
        assertThat(잔나비존재여부).isFalse();
    }

    boolean myContains(ArrayList<String> names, String name) {
       //나
        /* for (int i = 0; i < names.size(); i++) {
            if (names.get(i) == name) {
                return true;
            }
        }
        return false;
    }*/

        //코치님
     for (String s : names) {
            if(s.equals(name)){
                return true;
            } //왜 여기에 안넣으냐면 if문 속에 false가 되면 다시 반복문으로 돌아가기 때문에 계속 돌다가 return true값이 나오지 않게 되면 반복문이 끝난 후 return false값을 넣어줘야하는 것이다.
        }
        return false;
    }

    @Test
    void getCommonElementsTest() {
        List<Integer> firstList = List.of(1, 2, 3);
        List<Integer> secondList = List.of(2, 3, 4);

        List<Integer> commonElements = getCommonElements(firstList, secondList);

        assertThat(commonElements).containsExactlyInAnyOrder(2, 3);
    }

    List<Integer> getCommonElements(List<Integer>firstList, List<Integer> secondList){
        ArrayList<Integer> common = new ArrayList<>();

       /* 나
       for (Integer commonNum : firstList) {
            if(secondList.contains(commonNum)){
                common.add(commonNum);
            }
        }
        return common;*/

        HashMap<Integer, Boolean> l2Map = new HashMap<>();
        for (Integer i : secondList) { //쭉 한번 모든 수를 l2Map으로 put하기
            l2Map.put(i, true);
        }

        for (Integer i : firstList) {
//            if (l2.contains(i)) {
            if (l2Map.containsKey(i)) { //secondlist에 키값이 firstList안에 있으면
                common.add(i); //공통된 리스트에 넣어라
            }
        }

        return common;
        //내 코드는 짧지만, 긴 코치님의 코드는 성능이 더 빠름 20초 걸릴 걸 0.3초만에 끝내심
        //방대한 양의 데이터를 관리하려면 map을 사용해서 활용하는게 낫다.
    }



    @Test
    void myFrequencyTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("이지은");
        names.add("하현우");
        names.add("하현우");
        names.add("하현우");

        int 박효신Count = myFrequency(names, "박효신");
        int 이지은Count = myFrequency(names, "이지은");
        int 하현우Count = myFrequency(names, "하현우");

        assertThat(박효신Count).isEqualTo(1);
        assertThat(이지은Count).isEqualTo(2);
        assertThat(하현우Count).isEqualTo(3);
    }

    int myFrequency(ArrayList<String> names, String name){
        //리스트 안에 몇번 반복했는지 보자
        int count = 0;
        for (String name1 : names) {
            //name1은 names의 각각의 요소들이라고 생각하기
            if(name1.equals(name)){ //그래서 names.equals(name)이 아니라, name1을 사용한거임!
                count = count + 1;
            }
        }
        return count;
    }

}
