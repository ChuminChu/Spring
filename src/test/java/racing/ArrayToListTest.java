package racing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayToListTest {
    @Test
    void arrayToListTest() {
        //given
        String[] arr = { "A", "B", "C" };

        //when
        List<String> list = Arrays.asList(arr);

        //then
        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("B");
        assertThat(list.get(2)).isEqualTo("C");
    }
}
