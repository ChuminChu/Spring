package javapractice;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class StackQueueTest {
    @Test
    void stack(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.peek()).isEqualTo(3);
        assertThat(stack.pop()).isEqualTo(3);
        assertThat(stack.peek()).isEqualTo(2);

    }

    @Test
    void queue(){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        assertThat(queue.peek()).isEqualTo(1);
        assertThat(queue.poll()).isEqualTo(1);
        assertThat(queue.peek()).isEqualTo(2);
    }
}
