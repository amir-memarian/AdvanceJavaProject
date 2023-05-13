package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static khodro.mashin.Dande.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CompareMashinTest 
{
    @Test
    void Should_compare_mashin() {
        Mashin bmw1 = new Mashin("BMW",150, AUTOMATIC);
        Mashin bmw2 = new Mashin("BMW",150, AUTOMATIC);

        assertThat(bmw1.equals(bmw2)).isTrue();
        assertThat(Objects.equals(bmw1,bmw2)).isTrue();
        assertThat(bmw1).isEqualTo(bmw2);


    }
}
