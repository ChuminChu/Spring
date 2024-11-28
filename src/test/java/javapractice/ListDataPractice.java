package javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class ListDataPractice {
    @Test
    void listData(){
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
    }

    @Test
    void mapTest(){
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
    void test(){
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
}
