package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest {
    @Test
    void maxTest() {
        assertThat(Math.max(10, 7)).isEqualTo(10); //isEqualTo는 10이 아닐 시 컴퓨터가 "너 이거 틀렸어~" 라고 알려줌 즉, 테스트 해보는 역할!!

        assertThat(square(5)).isEqualTo(25);
        assertThat(square(-4)).isEqualTo(16);

        assertThat(getAverage(100, 100, 70)).isEqualTo(90);
        assertThat(getAverage(0, 100, 50)).isEqualTo(50);

        assertThat(calculateBirthYear(1)).isEqualTo(2024);
        assertThat(calculateBirthYear(2)).isEqualTo(2023);
        assertThat(calculateBirthYear(20)).isEqualTo(2005);

        assertThat(isPositive(3)).isEqualTo(true);
        assertThat(isPositive(9)).isTrue();
        assertThat(isPositive(0)).isFalse();
        assertThat(isPositive(-5)).isFalse();

        assertThat(isNegative(3)).isEqualTo(false);
        assertThat(isNegative(9)).isFalse();
        assertThat(isNegative(0)).isFalse();
        assertThat(isNegative(-5)).isTrue();

        assertThat(getBigger(3, 7)).isEqualTo(7);
        assertThat(getBigger(7, 3)).isEqualTo(7);
        assertThat(getBigger(-9, -1)).isEqualTo(-1);

        assertThat(getBiggest(1, 2, 3)).isEqualTo(3);
        assertThat(getBiggest(3, 2, 1)).isEqualTo(3);
        assertThat(getBiggest(-3, -2, -1)).isEqualTo(-1);
        assertThat(getBiggest(-1, -2, -3)).isEqualTo(-1);

        assertThat(getBiggest(1, 2, 3)).isEqualTo(3);
        assertThat(getBiggest(3, 2, 1)).isEqualTo(3);
        assertThat(getBiggest(-3, -2, -1)).isEqualTo(-1);
        assertThat(getBiggest(-1, -2, -3)).isEqualTo(-1);
    }

    int square(int n) {
        return n * n;
    }

    //
    int getAverage(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    //나이를 전달받아 출생 연도를 구해 반환한다.
    int calculateBirthYear(int a) {
        return 2025 - a;
    }

    //정수 하나를 전달받아 0보다 큰지 아닌지 판단 결과를 반환한다.
    boolean isPositive(int a) {
        if (a > 0) {
            return true;
        }//a>0보다 클때는 true인데 그러지 않을 때도 return을 넣어줘야 하니까 안넣어주면 에러나게됨
        return false;
    }

    //정수 하나를 전달받아 0보다 작은지 아닌지 판단 결과를 반환한다.
    boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    //정수 2개를 전달받아 그 중 더 큰 수를 반환한다.
    int getBigger(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    //3정수를 전달받아 그 중 가장 큰 수를 반환한다.
    int getBiggest(int a, int b, int c) {
        /* 1
        if(a > b && a > c ){
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }*/
        /* 2
        getBigger(a, b); //getBigger자체에서 더 큰 값을
        int n = getBigger(a, b); // n에다가 기억해둔다. getBigger(a, b); 이 자체가 값이니까 가능함.
        getBigger(n, c); // 그 큰 값과 c값을 비교하여
        return getBigger(n, c); //더 큰 값을 return한다.
         */

        /* 3
        int bigger = getBigger(a,b); //=오른쪽에 있는 애는 읽는 용 / 즉 데이터 하나로 나옴
        return getBigger(bigger, c);
         */
        return getBigger(getBigger(a,b), c);
    }

    //3정수를 전달받아 그 중 가장 작은 수를 반환한다.
    /*int min(int a, int b, int c) {

        }

        */

    //정수 하나를 전달받아 그 절댓값을 반환한다.
    int abs(int a){
        if(a < 0 ){
            return -a;
        } return a;
    }

    //문자열 하나를 전달 받아 빈 문자열인지 판단한 결과를 반환한다.

    }//이거 없으면 안돌아감