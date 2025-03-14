package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Application {

    //이렇게 변수로 남겨두면 유지보수하기 편하다. - 한번에 관리하기도 편함
    static final String mask = "_";
    static final int Max_Wrong_count = 8;

    public static void main(String[] args) {

        System.out.println("행맨게임을 시작하겠습니다.");
        String answerWord = Utils.getRandomWord();

        //-,-,-,표시하는거
        List<String> maskedWord = generateMaskedWord(answerWord);
        //-,-,-, -> ----로 바꾸기

        /*
        //-,-,-,이거 표시하는거
        ArrayList<String> maskedWord = new ArrayList<>();
        for (int i = 0; i < answerWord.length(); i++) {
            maskedWord.add(mask);

        }
        System.out.println(String.join("",maskedWord));
        */
        int wrongCount = 0;

        while (!isGameOver(maskedWord, wrongCount)) {
            showWord(maskedWord);
            String userGuess = Utils.getGuess();
            System.out.println("틀린 횟수 : " + wrongCount);


            //사용자가 추측한 알파벳이 answord안에 있는지 없는지 확인하는거
            List<Integer> indexes = locateUserGuess(answerWord, userGuess);
            /*
            List<Integer> indexes = IntStream.range(0, answerWord.length()) // [0, 1, 2, 3]
                    .filter(index -> {
                        //substring은 (a,b) a에서 b까지의 문자를 빼내자
                        return answerWord.substring(index, index + 1).equals(userGuess);
                    })
                    .boxed()
                    .toList();
            */

            //맞췄을때 -if없어도 위에서 indexes가 없으면 자동으로 for가 실행이 안되서 없어도됨
            maskedWord = replaceWithAlphabet(maskedWord, indexes, userGuess);

           /*
           for (Integer index : indexes) {
                maskedWord.set(index, userGuess);

            }
            System.out.println(String.join("",maskedWord));
            */

            //틀렸을때
            wrongCount = incrementWrongCount(indexes, wrongCount);
           /*
           if(indexes.isEmpty()){
                System.out.println(Utils.getHangmanPic(wrongCount));
                wrongCount = wrongCount + 1;
            }
            */

            //알파벳 다 맞췄을때 - 찐 정답일때
            /*
            if(!maskedWord.contains(mask)){
                System.out.println("정답을 맞췄습니다! 게임을 종료힙니다");
                return;
            }

            //졌을 때
            if(wrongCount == Max_Wrong_count){
                System.out.println("죽었습니다. 게임을 종료합니다");
                return;
            }
            */

        }
    }

    //-,-,-,이거 표시하는거
    static List<String> generateMaskedWord(String answerWord){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < answerWord.length(); i++) {
            list.add(mask);
        }
        return list;
    }

    //-,-,-, -> ----로 바꾸기
    static void showWord(List<String> maskedWord) {
        String joinedWord = String.join("", maskedWord);
        System.out.println(joinedWord);
    }

    //사용자가 추측한 알파벳이 있는지 없는지 / 있으면 그 숫자만큼 return해라
    static List<Integer> locateUserGuess(String answerWord, String userGuess){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < answerWord.length(); i++) {
            if(answerWord.substring(i, i+1).equals(userGuess)){
                result.add(i);
            }
        }
        return result;
    }

    // 사용자가 추측한 알파벳이 정답일 때 - 정답을 바꿔주기
    static List<String> replaceWithAlphabet(List<String> maskedWord, List<Integer> indexes, String userGuess){
        ArrayList<String> result = new ArrayList<>();
        //먼저 ----를 알파벳에 다 넣어주고
        for (String alphabet : maskedWord) {
            result.add(alphabet);
        }
        //indexes에는 그 알파벳이 정답에 어디에 있는지 알려주는 함수
        //index에는 만약에 indexes에 0,3이 들어있으면 0에 index를 가지고, 3에 index를 가진다고 생각
        for (Integer index : indexes) {
            //그래서 result에 index 0에는 userGuess를 넣어준다.
            result.set(index, userGuess);

        }

        return result;

    }

    // 사용자가 추측한 알파벳이 틀렸을 때 - wrongCount +1 해주기
    static int incrementWrongCount(List<Integer> indexes, int wrongCount){
        if(indexes.isEmpty()){
            System.out.println(Utils.getHangmanPic(wrongCount));
            wrongCount = wrongCount + 1;
        }
        return wrongCount;
    }

    static boolean isGameOver(List<String> maskedWord, int wrongCount){
        //게임 이겼을 때
        if(!maskedWord.contains(mask)){
            System.out.println("정답을 맞췄습니다! 게임을 종료힙니다");
            return true;
        }
        //졌을 때
        if(wrongCount == Max_Wrong_count){
            System.out.println("죽었습니다. 게임을 종료합니다");
            return true;
        }
       return false;
    }


}
