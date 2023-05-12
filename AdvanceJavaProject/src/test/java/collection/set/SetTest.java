package collection.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.lang.System.out;

public class SetTest {

    @Test
    void HashSet_Should_Remove_Duplication() {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");


        Set<String> exceptedAnimals=new HashSet<>();
        exceptedAnimals.add("Dog");
        exceptedAnimals.add("Cat");
        exceptedAnimals.add("Rabbit");
        Assertions.assertThat(animals).isEqualTo(exceptedAnimals);

        for (String animal : animals) {
            out.println(animal);
        }
    }

    @Test
    void LinkedHashSet_Should_Maintain_Insertion_Order() {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            out.println(animal);
        }
    }

    @Test
    void TreeSet_Should_Sort_Data() {
        Set<String> animals = new TreeSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            out.println(animal);
        }
    }
}
