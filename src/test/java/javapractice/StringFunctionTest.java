package javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StringFunctionTest {

    @Test
    void name(){
        //new ArrayList<String> +"ctrl+option(alt)+v"하면 자동완성가능
        ArrayList<String> strs = new ArrayList<>();//<Integer> / <Character> <Double> - <>안에는 대문자로 시작하는 애들만 들어올 수 있다.
        strs.add("김찌");

        strs.get(0);

        strs.set(0, "된찌");

        strs.remove(0);
    }
}
