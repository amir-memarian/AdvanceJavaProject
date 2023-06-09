package khodro;

import khodro.Khodro;
import khodro.Kashti;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

public class KashtiTest {
    @Test
    void protected_Method() {
        Khodro kashti = new Kashti();
        kashti.ayaDarHalHarekatAst();
    }

    @Test
    void super_Keyword(){
        Khodro kashti = new Kashti();
        System.out.println(kashti.toString());
    }

    @Test
    void this_Keyword() {
        Kashti kashti = new Kashti();
        Mashin mashin = new Mashin("Zhian",250, Dande.MANUAL);

        kashti.printRefrence();
        kashti.printRefrenceObject(this);
        kashti.printRefrenceObject(mashin);
    }
}
