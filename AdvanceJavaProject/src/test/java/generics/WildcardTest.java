package generics;

import khodro.Kashti;
import khodro.Khodro;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class WildcardTest {
    @Test
    void should_print_names() {
        List<Khodro> khodroha = asList(new Mashin("Nissan"),new Kashti());

        printNames(khodroha);

        List<Mashin> mashinha = asList(new Mashin("Pejo"),new Mashin("benz"));

        printNames(mashinha);

    }

    private static void printNames(List<? extends Khodro> khodroha) {
        for (Khodro khodro : khodroha) {
            System.out.println(khodro.getMark());
        }
    }
}
