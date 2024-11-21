package javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class dataStructureListFor {

    @Test
    void dataStructureListFor(){
        //먼저, 다음 점수들을 ArrayList 오브젝트에 추가하세요: 80, 60, 70, 100, 90
        ArrayList<Integer> score = new ArrayList<>();
        score.add(80);
        score.add(60);
        score.add(70);
        score.add(100);
        score.add(90);

        System.out.println(score);

        //점수의 총점
        int sum = 0;
        for (int i = 0; i < score.size(); i++) {
            sum = sum + score.get(i);
        }

        System.out.println(sum);

        //이 점수들의 평균 점수를 출력해 보세요. 단, 점수는 5개가 아닐 수도 있습니다.
        int aver = 0;
        for (int i = 0; i < score.size(); i++) {
            aver = sum / score.size();
        }

        System.out.println(aver);

        //최고 점수를 출력해 보세요.
        int bestScore = score.get(3);
        for (Integer 점수 : score) { // Integer i 가 아니라 i에 점수를 넣으면 점수자체에 넣어주는 거임,,
            if(bestScore <= 점수){
                bestScore = 점수;
            }
        }
        System.out.println(bestScore);

        //최저 점수를 출력해보세요
        int lowerScore = score.get(0);
        for (Integer 점수 : score) {
            if(lowerScore >= 점수){
                lowerScore = 점수;
            }
        }
        System.out.println(lowerScore);

        //평균보다 낮은 점수들만 새로운 arraylist오브젝트에 담기
        ArrayList<Integer> lowers = new ArrayList<Integer>();
        for(Integer 점수 : score){
            if(aver > 점수){
                lowers.add(점수);
            }
        }
        System.out.println(lowers);

        //평균보다 높은 점수들만 새로운 arraylist오브젝트에 담기
        ArrayList<Integer> better = new ArrayList<Integer>();
        for(Integer 점수 : score){
            if(aver < 점수){
                better.add(점수);
            }
        }
        System.out.println(better);
    }
}
