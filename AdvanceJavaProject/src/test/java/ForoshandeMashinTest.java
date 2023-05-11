import foroshande.Foroshande;
import khodro.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {
    @Test
    void Bayad_Tedad_Kol_Mashin_Haye_Forokhte_Shode_Ra_Bedast_Avarim() {
        Foroshande ali = new Foroshande();
        Foroshande amir = new Foroshande();

        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        amir.foroshMashin();
 //       Mashin mashin = new Mashin();
 //       System.out.println("object in test: "+mashin);
        Assertions.assertEquals(5, Mashin.tedadForosh);

    }
}
