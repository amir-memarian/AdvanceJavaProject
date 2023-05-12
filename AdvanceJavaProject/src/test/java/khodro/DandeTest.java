package khodro;

import khodro.mashin.Dande;
import org.junit.jupiter.api.Test;

public class DandeTest {

    @Test
    void print_all_Dande_values() {
        Dande.print();
    }

    @Test
    void print_all_Dande_toPersian() {
        System.out.println("In Persian");
        Dande.printToPersian();
    }
    @Test
    void print_all_Dande_toFrench() {
        System.out.println("In Ferench");
        Dande.printToFerench();
    }

}
