package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static khodro.mashin.Dande.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CompareCollectionTest {
    @Test
    void Should_Compare_non_hash_Collection() {
        List<Mashin> mashinha_1 = new ArrayList<>();
        mashinha_1.add(new Mashin("Benz",100, MANUAL));

        List<Mashin> mashinha_2 = new ArrayList<>();
        mashinha_2.add(new Mashin("Benz",100, MANUAL));

        assertThat(mashinha_1.equals(mashinha_2)).isTrue();

    }
    @Test
    void Should_Compare_hash_Collection() {
        Set<Mashin> mashinha_1 = new HashSet<>();
        mashinha_1.add(new Mashin("Benz",100, MANUAL));

        Set<Mashin> mashinha_2 = new HashSet<>();
        mashinha_2.add(new Mashin("Benz",100, MANUAL));

        assertThat(mashinha_1.equals(mashinha_2)).isTrue();

    }

}
