package javapractice;

import org.junit.jupiter.api.Test;

import java.util.*;


import static org.assertj.core.api.Assertions.assertThat;


public class MapTest {


    @Test
    void mapTest() {
        Map<String, String> englishKorean = new HashMap<>();
        englishKorean.put("book", "책");
        englishKorean.put("apple", "사가ㅗ"); // 이 코드를 수정하지 마세요
        englishKorean.put("car", "자동차");

        // 아래에 코드 한 줄 추가
        englishKorean.put("apple", "사과");

        // 아래 테스트를 통과해야 합니다
        assertThat(englishKorean).containsEntry("apple", "사과");
    }

    @Test
    void studentAgeMap() {
        // 1. 학생 이름(String)과 나이(Integer)를 저장하는 Map을 생성하세요
        Map<String, Integer> student = new HashMap<>();
        // 2. 3명의 학생 정보를 추가하세요
        student.put("추민영", 23);
        student.put("박다영", 24);
        student.put("박연우", 25);

        // 3. 특정 학생의 나이를 출력하세요
        System.out.println(student.get("박연우"));
    }

    @Test
    void fruitPriceMap() {
        // 1. 과일 이름(String)과 가격(Integer)을 저장하는 Map을 생성하세요
        Map<String, Integer> fruit = new HashMap<>();
        fruit.put("귤", 1000);
        fruit.put("망고", 2000);
        fruit.put("망고스틴", 3000);

        // 2. 모든 과일의 이름과 가격을 출력하세요
        for (Map.Entry<String, Integer> entry : fruit.entrySet()) {
            String fruitK = entry.getKey();
            Integer price = entry.getValue();
            System.out.println(fruitK + price);
        }

        // 3. 특정 과일의 가격을 업데이트하세요
        fruit.put("망고", 3500);
        System.out.println("망고: " + fruit.get("망고"));

        int 기준가격 = 3000;

        //4. 가격이 특정 금액 이상인 과일들만 출력하세요
        for (Map.Entry<String, Integer> entry : fruit.entrySet()) {
            String Key = entry.getKey();
            Integer value = entry.getValue();
            if (기준가격 <= value) {
                System.out.println("3000원보다 큰 과일은" + Key + " 입니다");
            }
        }
    }

    @Test
    void product() {
        Map<String, Integer> productStock = new HashMap<>();
        productStock.put("갤럭시 S24", 8);
        productStock.put("삼다수 2L", 20);
        productStock.put("칙촉 오리지널 6+2입 120g", 10);
        productStock.put("M4 맥북 프로", 5);

// 아래에 코드를 작성해 주세요
// 🚫 productStock.put("갤럭시 S24", 7);
// 🚫 productStock.put("M4 맥북 프로", 4);
        int value = productStock.get("갤럭시 S24") - 1; //7
        productStock.put("갤럭시 S24", value);
        int value2 = productStock.get("M4 맥북 프로") - 1; //19
        productStock.put("M4 맥북 프로", value2);

// 아래 테스트를 통과해야 합니다
        assertThat(productStock.get("갤럭시 S24")).isEqualTo(7);
        assertThat(productStock.get("M4 맥북 프로")).isEqualTo(4);
    }

    @Test
    void sameName() {
        List<String> nameList = List.of( //사람이름
                "권상윤",
                "김민성",
                "추민영",
                "김성락",
                "황승혁",
                "문성희",
                "문인혁",
                "박현지",
                "윤찬영",
                "윤태우",
                "권상윤",
                "이채현",
                "황효진",
                "권상윤",
                "황승혁",
                "박현지",
                "이호연",
                "전지예",
                "정해준",
                "문인혁",
                "김성락",
                "추민영",
                "허재",
                "황승혁",
                "황효진"
        );
// 아래에 코드 추가
        //해쉬맵 만들기
        Map<String, Integer> map = new HashMap<>();

        //리스트에 있는 데이터를 맵으로 옮기는 구조
        for (String name : nameList) { //nameList를 반복할거야
            if (map.containsKey(name)) { //만약에 map에 nameList의 name이 있다면
                int count = map.get(name) + 1; // 하나 +해
                map.put(name, count);

            } else {
                map.put(name, 1);
            }
        }


// 아래 테스트를 통과해야 합니다
        assertThat(map).containsEntry("추민영", 2)
                .containsEntry("문성희", 1)
                .containsEntry("전지예", 1)
                .containsEntry("정해준", 1)
                .containsEntry("김성락", 2)
                .containsEntry("이호연", 1)
                .containsEntry("권상윤", 3)
                .containsEntry("황승혁", 3)
                .containsEntry("박현지", 2)
                .containsEntry("김민성", 1)
                .containsEntry("이채현", 1)
                .containsEntry("문인혁", 2)
                .containsEntry("황효진", 2)
                .containsEntry("윤찬영", 1)
                .containsEntry("윤태우", 1)
                .containsEntry("허재", 1);
    }

    //    두 리스트에 모두 존재하는 수 찾기 (교집합 찾기)
    @Test
    void intersection() {
        //    정수 리스트 2개가 주어집니다.
        //    두 리스트에 모두 존재하는 수들을 따로 리스트에 담아 보세요.
        List<Integer> firstNum = List.of(
                1, 2, 3, 4
        );
        List<Integer> secoundNum = List.of(
                2, 4, 5, 6
        );

        HashMap<Integer, Boolean> frist = new HashMap<>();
        for (Integer num : firstNum) {
            frist.put(num, true);
        }

        HashMap<Integer, Boolean> uni = new HashMap<>();
        for (Integer num : secoundNum) {
            if (frist.containsKey(num)) {
                uni.put(num, true);
            }
        }

        for (Integer key : uni.keySet()) {
            System.out.println("key = " + key);
        }
    }

    //팀 구성하기
    @Test
    void 팀구성2() {
        List<String> names = Arrays.asList("윤찬영",
                "정해준",
                "권상윤",
                "문인혁",
                "허재",
                "이호연",
                "윤태우",
                "김성락",
                "전지예",
                "황승혁",
                "이채현",
                "황효진",
                "김민성",
                "박현지",
                "문성희",
                "추민영");
        Collections.shuffle(names);

        ArrayList<ArrayList<String>> teams = new ArrayList<>();
//        ArrayList<String> team1 = new ArrayList<>();
//        ArrayList<String> team2 = new ArrayList<>();
//        ArrayList<String> team3 = new ArrayList<>();
//        ArrayList<String> team4 = new ArrayList<>();
//        teams.add(team1);
//        teams.add(team2);
//        teams.add(team3);
//        teams.add(team4);
        for (int i = 0; i < 4; i++) {
            ArrayList<String> team = new ArrayList<>();
            teams.add(team);
        }

        //        team1.add(names.get(0));
        //        team1.add(names.get(1));
        //        team1.add(names.get(2));
        //        team1.add(names.get(3));
        //        team2.add(names.get(4));
        //        team2.add(names.get(5));
        //        team2.add(names.get(6));
        //        team2.add(names.get(7));
        //        team3.add(names.get(8));
        //        team3.add(names.get(9));
        //        team3.add(names.get(10));
        //        team3.add(names.get(11));
        //        team4.add(names.get(12));
        //        team4.add(names.get(13));
        //        team4.add(names.get(14));
        //        team4.add(names.get(15));
        int teamNumber = 0;
        for (String name : names) {
            ArrayList<String> team = teams.get(teamNumber);
            team.add(name);

            if (team.size() == 4) {
                teamNumber = teamNumber + 1;
            }
        }

        System.out.println(teams);
    }
}
