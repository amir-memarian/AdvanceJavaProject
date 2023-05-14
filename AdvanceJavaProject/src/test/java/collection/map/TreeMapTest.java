package collection.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    void Should_sort_elements() {
        //Given
        Map<String,String> geometrics = new TreeMap<>();
        geometrics.put("Mosalas","red");
        geometrics.put("Mostatil","Yellow");
        geometrics.put("SheshZelee","Sabz");
        geometrics.put("Moraba","red");

        //Then
        Object[] keys = geometrics.keySet().toArray();
        Assertions.assertThat(keys[0]).isEqualTo("Moraba");
        Assertions.assertThat(keys[1]).isEqualTo("Mosalas");
        Assertions.assertThat(keys[2]).isEqualTo("Mostatil");
        Assertions.assertThat(keys[3]).isEqualTo("SheshZelee");

    }
    @Test
    void Should_sort_elements_in_reverse_order() {
        //Given
        Map<String,String> geometrics = new TreeMap<>(Comparator.reverseOrder());
        geometrics.put("Mosalas","red");
        geometrics.put("Mostatil","Yellow");
        geometrics.put("SheshZelee","Sabz");
        geometrics.put("Moraba","red");

        //Then
        Object[] keys = geometrics.keySet().toArray();
        Assertions.assertThat(keys[0]).isEqualTo("SheshZelee");
        Assertions.assertThat(keys[1]).isEqualTo("Mostatil");
        Assertions.assertThat(keys[2]).isEqualTo("Mosalas");
        Assertions.assertThat(keys[3]).isEqualTo("Moraba");

    }
}
