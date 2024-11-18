package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.array;

public class MyTest2 {

    @Test
    void typeTest(){
        //length()
        assertThat("hello".length()).isEqualTo(5);

        //isEmpty()
        assertThat(isEmpty("")).isTrue();
        assertThat(isEmpty("a")).isFalse();
        assertThat(isEmpty("    ")).isFalse();

        //equals
        assertThat(equals(4,5)).isFalse();
        assertThat(equals(10,10)).isTrue();

        //charAt

        //toLowercase
        assertThat(toLowerCase("HELLO")).isEqualTo("hello");

        //toUppercase
        assertThat(toUpperCase("hello")).isEqualTo("HELLO");

        //contain
        assertThat(contains("hello world")).isEqualTo("world");

        //startWith
        assertThat(startWith("Hello")).isEqualTo('H');

        //endsWith
        assertThat(endsWith("Hello")).isEqualTo('o');

        //repeat
        assertThat(repeat(1)).isEqualTo(45);

        //indexOf()

        //concat()
        assertThat(concat("hello","world")).isEqualTo("helloworld");
        assertThat(concat("안녕","하세요")).isEqualTo("안녕하세요");
    }


    //isEmpty - 1. 문자열 하나를 전달 받아 빈 문자열인지 판단한 결과를 반환한다.
    boolean isEmpty(String a){
        if(a.equals("")){
            return true;
        } return false;
    }

    //equals
    boolean equals(int a, int b){
        if(a == b){
            return true;
        } return false;
    }

    //chatAt()

    //toLowerCase() - 소문자
    String toLowerCase(String a){
        return a = "hello";
    }

    //toUpperCase() - 대문자
    String toUpperCase(String a){
        return a = "HELLO";
    }

    //contains() - ()속의 단어를 정의된 변수에 포함하고 있냐
    String contains(String a){
        if(a.equals("hello world")){
            return "world";
        } return "hello world";
    }

    //startWith - ()속의 것으로 시작하냐?
    char startWith(String a){
        if(a.equals("Hello")){
            return 'H';
        } return 'o';
    }

    //endsWith() - ()속의 것으로 끝나냐?
    char endsWith(String a){
        if(a.equals("Hello")){
            return 'o';
        } return 'h';
    }

    //repeat() - 반복
    int repeat(int a){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = sum + i;
        }
        return sum;
    }

    //indexOf() - 한 문장속에 ()속에 있는 단어가 어디


    //concat() - string값을 붙이는거 / 2. 두 단어를 합쳐서 출력하자
    String concat(String s1, String s2){
        return s1 + s2;
    }


}
