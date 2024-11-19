package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(equals("hello")).isTrue();
        assertThat(equals("world")).isFalse();


        //charAt
        assertThat(charAt("hello")).isEqualTo('l');

        //toLowercase
        assertThat(toLowerCase("HELLO")).isEqualTo("hello");

        //toUppercase
        assertThat(toUpperCase("hello")).isEqualTo("HELLO");

        //contain
        assertThat(contains("hello world")).isTrue();

        //startWith
        assertThat(startWith("Hello")).isTrue();

        //endsWith
        assertThat(endsWith("hello world.")).isTrue();
        assertThat(endsWith("hello world")).isFalse();


        //repeat
        assertThat(repeat("chu")).isEqualTo("chuchuchu");


        //indexOf()
        assertThat(indexOf("hello")).isEqualTo(4);

        //concat()
        assertThat(concat("hello","world")).isEqualTo("helloworld");
        assertThat(concat("안녕","하세요")).isEqualTo("안녕하세요");

        //substring
        assertThat(substring("hello world")).isEqualTo("o wor");

        //replace
        assertThat(replace("bello world")).isEqualTo("bello world");

        //trim
        assertThat(trim("  hello  ")).isEqualTo("hello");
    }


    //isEmpty - 1. 문자열 하나를 전달 받아 빈 문자열인지 판단한 결과를 반환한다.
    boolean isEmpty(String a){
        if(a.equals("")){
            return true;
        } return false;
    }

    //equals
    boolean equals(String a){
        return a.equals("hello");
    }

    //chatAt() - 내가 찾는 글자가 뭐냐
    char charAt(String str){
        return str.charAt(3);
    }

    //toLowerCase() - 소문자
    String toLowerCase(String a){
        return a.toLowerCase();
    }

    //toUpperCase() - 대문자
    String toUpperCase(String a){
        return a.toUpperCase();
    }

    //contains() - ()속의 단어를 정의된 변수에 포함하고 있냐
    boolean contains(String str){
        return str.contains("h");
    }

    //startWith - ()속의 것으로 시작하냐?
    boolean startWith(String str){
        return str.startsWith("H");
    }

    //endsWith() - ()속의 것으로 끝나냐?
    boolean endsWith(String str) {
        return str.endsWith(".");
    }

    //repeat() - 반복
    String repeat(String str){
        return str.repeat(3);
    }

    //indexOf() - 한 문장속에 ()속에 있는 단어가 어디
    int indexOf(String str){
        return str.indexOf("o");
    }


    //concat() - string값을 붙이는거 / 2. 두 단어를 합쳐서 출력하자
    String concat(String s1, String s2){
        return s1 + s2;
    }

    //substring() - 어디서부터 어디까지 출력
    String substring(String str){
        return str.substring(4,9);
    }

    //replace() - 반복
    String replace(String str){
        return str.replace('h','b');
    }

    //trim() - 공백 삭제
    String trim(String str){
        return str.trim();
    }

    //String.format()


    @Test
    void 최대최소제한(){
        assertThat(영과백사이(130)).isEqualTo(100);
        assertThat(영과백사이(50)).isEqualTo(50);
        assertThat(영과백사이(-30)).isEqualTo(0);
    }
    int 영과백사이(int n){
        /*
        int min = Math.min(n, 100);
        return Math.max(min, 0);
         */

        return Math.max(Math.min(n, 100),0);

    }




}
