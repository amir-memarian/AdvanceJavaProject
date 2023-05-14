package kata.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void init(){
        stack = new Stack(5);

    }
    @Test
    void Newly_Created_Stacks_Should_be_Empty() {
        assertThat(stack.getSize()).isEqualTo(0);
    }
    @Test
    void After_one_push_stack_size_should_be_one() {
        stack.push("A");

        assertThat(stack.getSize()).isEqualTo(1);
    }

    @Test
    void After_one_push_and_one_pop_stack_should_be_empty() {
        stack.push("A");
        stack.pop();

        assertThat(stack.getSize()).isEqualTo(0);
    }

    @Test
    void When_Pushed_Passed_Limit_throw_stack_overflow_exception() {
        stack.push("A");
        stack.push("A");
        stack.push("A");
        stack.push("A");
        stack.push("A");
        assertThatExceptionOfType(StackOverflowException.class)
                        .isThrownBy(() ->stack.push("A"));
    }

    @Test
    void When_popped_passed_limit_stack_underflows() {
        assertThatExceptionOfType(StackUnderflowException.class)
                .isThrownBy(() ->stack.pop());
    }

}
