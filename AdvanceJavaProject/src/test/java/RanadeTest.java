import khodro.Ranande;
import org.junit.jupiter.api.Test;

public class RanadeTest {
    @Test
    void Bayad_Noe_Gavahiname_va_nam_ra_chap_konid() {

        Ranande ranande = new Ranande();
        Ranande.Gavahiname gavahiname = ranande.new Gavahiname();
        gavahiname.print();
    }
    @Test
    void Bayad_nam_ra_chap_konid() {

        Ranande.staticGavahiname staticGavahiname = new Ranande.staticGavahiname();
        staticGavahiname.print();
    }

}
