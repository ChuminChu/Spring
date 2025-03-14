package hangman;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class hangmangame {

    @Test
    void hangmanGame(){
        // 아래 코드를 참고하여 정답이 "FOOD"가 아닐 때도 동작하게 작성하세요.
        String answerWord = "FOOD";
        ArrayList<String> maskedWord = new ArrayList<>();
        for (int i = 0; i < answerWord.length(); i++) {
            maskedWord.add("_");
        }
        System.out.println(maskedWord);
    }

    @Test
        //사용자가 추축한 단어가 있을 때
    void 인덱스_찾기1() {
        String answerWord = "FOOD";
        String userGuess = "F";


        List<Integer> indexes = IntStream.range(0, answerWord.length()) // [0, 1, 2, 3]
                .filter(index -> {
                    //substring은 (a,b) a에서 b까지의 문자를 빼내자
                    return answerWord.substring(index , index + 1).equals(userGuess);
                })
                .boxed()
                .toList();

        assertThat(indexes).isEqualTo(List.of(0));



    }

    @Test
    void 인덱스_찾기2() {
        String answerWord = "FOOD";
        String userGuess = "Z";

        List<Integer> indexes = IntStream.range(0, answerWord.length())
                .filter(index -> {
                    //substring은 (a,b) a에서 b까지의 문자를 빼내자
                    return answerWord.substring(index , index + 1).equals(userGuess);
                })
                .boxed()
                .toList();

        assertThat(indexes).isEqualTo(List.of());
    }



}
