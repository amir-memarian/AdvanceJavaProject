package generics;

import com.sun.istack.internal.NotNull;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    @Test
    void should_works_but_have_error_in_runtime() {
        List list = new ArrayList();
        list.add(10);
        list.add("10");

//        Assertions.assertThat((Integer) list.get(1)).isNotNull();
        Assertions.assertThat(list.get(1)).isNotNull();
    }

    @Test
    void should_works() {
        List<Number> list = new ArrayList<>();
        list.add(10);

        final Integer[] integers = list.toArray(new Integer[5]);
//        final Integer[] integers = list.toArray(new String[5]);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    @Test
    void generic_method_syntax() {
        GenericMethod<Integer> gt = new GenericMethod<>();
        final Integer[] integers = gt.toArray(new Integer[0],"str");
    }

    class GenericMethod<E>{
       <S,T extends E> T[] toArray(T[] a,S s) {
            return null;
        }
    }
}
