import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import khodro.Mashin;

public class CarTest {
    @Test
    void Mashin_Moving_Door_closed_and_Mashin_Roshan() {
        //Given
        Mashin benz = new Mashin("benz");
        Mashin volvo = new Mashin("volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekadMikonad = volvo.ayaDarHalHarekatAst();

        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekadMikonad);
    }
}
