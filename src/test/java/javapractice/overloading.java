package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class overloading {
    @Test
    void overLoading(){
        //정사각형
        assertThat(calculateArea(3)).isEqualTo(9.0);

        //직사각형
        assertThat(calculateArea(3,4)).isEqualTo(12.0);

        //원
        assertThat(calculateArea(10,true)).isEqualTo(314.1592653589793);
    }
    /**
     * 다음 도형들의 면적을 계산하는 메서드를 오버로딩하여 구현하세요:
     * 1. 정사각형
     * 2. 직사각형
     * 3. 원
     *
     * @param side 정사각형의 한 변의 길이
     * @return 정사각형의 면적
     */
    double calculateArea(double side) {
        // TODO: 정사각형 면적 계산 로직을 구현하세요.
        return side * side;
    }

    /**
     * @param length 직사각형의 길이
     * @param width 직사각형의 너비
     * @return 직사각형의 면적
     */
    double calculateArea(double length, double width) {
        // TODO: 직사각형 면적 계산 로직을 구현하세요.
        return length * width;
    }

    /**
     * @param radius 원의 반지름
     * @return 원의 면적
     */
    double calculateArea(double radius, boolean isCircle) {
        // TODO: 원의 면적 계산 로직을 구현하세요. isCircle 매개변수는 오버로딩을 위해 사용됩니다.
        return  radius * radius * Math.PI ;

    }
}
