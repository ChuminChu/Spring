package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest2 {

    @Test
    void typeTest(){
        assertThat("hello".length()).isEqualTo(5);
        //assertThat("hello".charAt('h')).isEqualTo('c');
        assertThat("HELLO".toLowerCase()).isEqualTo("hello");
        assertThat("hello".toUpperCase()).isEqualTo("HELLO");

        //1
        assertThat(isEmpty("")).isTrue();
        assertThat(isEmpty("a")).isFalse();
        assertThat(isEmpty("    ")).isFalse();
        //2
        assertThat(concat("hello","world")).isEqualTo("helloworld");
        assertThat(concat("안녕","하세요")).isEqualTo("안녕하세요");

        assertThat(toLowerCase("hello")).isEqualTo("hello");

    }

    //1. 문자열 하나를 전달 받아 빈 문자열인지 판단한 결과를 반환한다.
    boolean isEmpty(String a){
        if(a.equals("")){
            return true;
        } return false;
    }

    String toLowerCase(String a){
        return  a = "hello";
    }

    //2. 두 단어를 합쳐서 출력하자
    String concat(String s1, String s2){
        return s1 + s2;
    }



    /*
    charAt() - 첫 문자
    toLowerCase() - 소문자
    toUpperCase() - 대문자
    contains() - ()속의 단어를 정의된 변수에 포함하고 있냐
    startWith - ()속의 것으로 시작하냐?
    endsWith() - ()속의 것으로 끝나냐?
    repeat() - 반복하냐
    indexOf() - 한 문장속에 ()속에 있는 단어가 어디 있냐
    concat() - string값을 붙이는거
     */
}
