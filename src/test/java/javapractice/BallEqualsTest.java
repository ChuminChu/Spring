package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallEqualsTest {
    @Test
    void ballEqualsTest() {
        // given
        // 같은 값의 Ball 오브젝트 두 개가 있는 상황에서
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(1,2);


        // when
        // 두 오브젝트를 equals()로 비교했을 때
        boolean ball비교 = ball1.equals(ball2);


        // then
        // 비교 결과는 true가 나와야 한다
        assertThat(ball비교).isTrue();
        //지금은 true가 아닌 false가 나온다. 왜냐하면 주소가 다르기 때문에. 따라서 오버라이드(재정의)를 해줘야한다.



    }
}
