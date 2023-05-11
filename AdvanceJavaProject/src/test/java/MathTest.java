import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void Bayad_Amaliat_Riazi_Anjam_Dahad() {
        double motegayer = -1.5;

        //Math math = new Math();

        double megdarMotlag = Math.abs(motegayer);

        Assertions.assertEquals(1.5,megdarMotlag);
        Assertions.assertEquals(1,Math.cos(0));
    }
}
