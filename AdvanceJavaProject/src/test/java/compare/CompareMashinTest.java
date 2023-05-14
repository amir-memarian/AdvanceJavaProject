package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import khodro.mashin.Mashincomparator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static khodro.mashin.Dande.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CompareMashinTest 
{
    @Test
    void Should_compare_mashin() {
        Mashin bmw_1 = new Mashin("BMW",150, AUTOMATIC);
        Mashin bmw_2 = new Mashin("BMW",150, AUTOMATIC);

        assertThat(bmw_1.equals(bmw_2)).isTrue();
        assertThat(Objects.equals(bmw_1,bmw_2)).isTrue();
        assertThat(bmw_1).isEqualTo(bmw_2);
    }

    @Test
    void Should_Sort_Mashin() {
        Mashin bmw_1 = new Mashin("BMW",150, MANUAL);
        Mashin bmw_2 = new Mashin("BMW",100, AUTOMATIC);
        Mashin bmw_3 = new Mashin("BMW",50, MANUAL);
        Mashin bmw_4 = new Mashin("BMW",50, AUTOMATIC);

        List<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw_1);
        mashins.add(bmw_2);
        mashins.add(bmw_3);
        mashins.add(bmw_4);

        Collections.sort(mashins);

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(bmw_3);
        expectedMashins.add(bmw_4);
        expectedMashins.add(bmw_2);
        expectedMashins.add(bmw_1);
        assertThat(mashins).isEqualTo(expectedMashins);


    }

    @Test
    void Should_Sort_Mashin_by_mark() {
        Mashin bmw = new Mashin("BMW",150, MANUAL);
        Mashin mercedes = new Mashin("Mercedes",100, AUTOMATIC);
        Mashin peykan = new Mashin("Peykan",50, MANUAL);
        Mashin alfaRomeo = new Mashin("Alfa Romeo",50, AUTOMATIC);

        List<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw);
        mashins.add(mercedes);
        mashins.add(peykan);
        mashins.add(alfaRomeo);

        Collections.sort(mashins,new Mashincomparator());

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(alfaRomeo);
        expectedMashins.add(bmw);
        expectedMashins.add(mercedes);
        expectedMashins.add(peykan);
        assertThat(mashins).isEqualTo(expectedMashins);
    }
}
