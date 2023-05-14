package compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareObjectsTest {

    @Test
    void Should_compare_primitive_objects() {
        assertThat(1==1).isTrue();
        assertThat(1!=1).isFalse();
        assertThat(1.2==1.2);
    }

    @Test
    void Should_compare_non_primitive_objects() {
        String s1 = new String("Amir");
        String s2 = new String("Amir");

        System.out.println(s1);
        System.out.println(s2);

        assertThat(s1 == s2).isFalse();
        assertThat(s1.equals(s2)).isTrue();

        String s3 = new String("AMIR");
        assertThat(s1.equalsIgnoreCase(s3)).isTrue();

        String str1 = "Amir";
        String str2 = "Amir";
        assertThat(str1 == str2).isTrue();
    }

    @Test
    void Skould_handle_null_object() {
        String str1 = null;
        String str2 = "Amir";
      //  assertThat(str1.equals(str2)).isFalse();
        assertThat(Objects.equals(str1,str2)).isFalse();
    }
}

