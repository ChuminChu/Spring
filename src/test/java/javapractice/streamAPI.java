package javapractice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class streamAPI {

    @Test
    void filter(){
        //정수 리스트에서 40보다 작은 수만 골라내기
        List<Integer> scores = List.of(100, 60, 35, 70, 38, 80);

        List<Integer> scoresBelow40 = scores.stream()
                .filter( n -> n < 40)
                .toList();

        assertThat(scoresBelow40).isEqualTo(List.of(35, 38));

    }

    @Test
    //정수 리스트에서 짝수만 골라내기
    void 필터_테스트_짝수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 ==0)
                .toList();

                assertThat(evenNumbers).isEqualTo(List.of(2, 4, 6, 8, 10));
    }

    @Test
    //이름들 중 길이가 3이 아닌 이름만 골라내기
    void 필터_테스트_길이_3_아닌_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() != 3)
                .toList();

                assertThat(filteredNames).isEqualTo(List.of("왕건", "박새로이", "이도"));
    }

    @Test
    //이름들 중 이씨만 골라내기
    void 필터_테스트_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("이")).toList();

                assertThat(filteredNames).isEqualTo(List.of("이성계", "이방원", "이도"));
    }

    @Test
    //이름들 중 두 글자 이면서 이씨인 이름
    void 필터_테스트_두_글자_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream()
                        .filter(n -> n.length() == 2 && n.startsWith("이"))
                                .toList();

                assertThat(filteredNames).isEqualTo(List.of("이도"));
    }

    @Test
    //정수 리스트의 모든 정수들을 제곱한 리스트 만들어내기
    void 맵_테스트_제곱() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n*n)
                .toList();

        assertThat(squaredNumbers).isEqualTo(List.of(1, 4, 9, 16, 25));
    }

    @Test
    //장바구니 상품 금액들에 할인 일괄적용
    void 맵_테스트_할인_적용() {
        List<Integer> 장바구니상품들가격 = List.of(100, 200, 300, 400, 500);

        List<Double> 할인적용된금액목록 = 장바구니상품들가격.stream()
                .map(price -> price * 0.9)
                .toList();

        assertThat(할인적용된금액목록).isEqualTo(List.of(90.0, 180.0, 270.0, 360.0, 450.0));
    }

    @Test
    //문자열들 대문자 변환
    void 맵_테스트_대문자화() {
        List<String> companies = List.of("google", "apple", "netflix");
        List<String> upperCasedCompanies = companies.stream()
                        .map(company -> company.toUpperCase())
                                .toList();

                assertThat(upperCasedCompanies).isEqualTo(List.of("GOOGLE", "APPLE", "NETFLIX"));
    }

    @Test
    //정수들을 짝수는 짝수문자열, 홀수는 홀수문자열로 변환
    void 맵_테스트_짝수_홀수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<String> evenOddNumbers = numbers.stream()
                .map(number -> {
                    if(number % 2 == 0){
                        return "짝수";
                    }
                    return "홀수";
                }).toList();

        assertThat(evenOddNumbers).isEqualTo(List.of("홀수", "짝수", "홀수", "짝수", "홀수"));
    }

    @Test
    //20000원 이상인 상품들의 10% 할인가를 계산하세요
    void 필터_맵_테스트1() {
        // given
        List<Integer> prices = Arrays.asList(1000, 25000, 30000, 15000, 5000, 40000);

        // when
        List<Double> discountedPrices = prices.stream()
                .filter(price -> price > 20000)
                        .map(price -> price * 0.9)
                                .toList();


        // then
        assertThat(discountedPrices).hasSize(3);
        assertThat(discountedPrices).isEqualTo(List.of(22500.0, 27000.0, 36000.0));
    }

    @Test
    //4글자 이상인 성씨들을 대문자로 변환하세요
    void 필터_맵_테스트2() {
        // given
        List<String> names = Arrays.asList("Kim", "Park", "Lee", "Choi", "Jung", "Kang");

        // when
        List<String> upperCasedNames = names.stream()
                .filter(name -> name.length() == 4)
                .map(name -> name.toUpperCase())
                .toList();


        // then
        assertThat(upperCasedNames).hasSize(4);
        assertThat(upperCasedNames).isEqualTo(List.of("PARK", "CHOI", "JUNG", "KANG"));
    }
}
