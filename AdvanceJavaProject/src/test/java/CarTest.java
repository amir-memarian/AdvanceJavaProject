import khodro.Khodro;
import khodro.mashin.Dande;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import khodro.mashin.Mashin;

public class CarTest {
    @Test
    void Mashin_Moving_Door_closed_and_Mashin_Roshan() {
        //Given
        Khodro benz = new Mashin("benz");
        Khodro volvo = new Mashin("volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekadMikonad = volvo.ayaDarHalHarekatAst();

        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekadMikonad);
    }

    @Test
    void Bayad_Print_konad() {
        Mashin pejo = new Mashin("Pejo",150, Dande.MANUAL);
        System.out.println(pejo.toString());
    }
}
