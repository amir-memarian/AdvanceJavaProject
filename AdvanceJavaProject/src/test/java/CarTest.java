import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import mashin.Mashin;

public class CarTest {
    @Test
    void Mashin_Moving_Door_closed_and_Mashin_Roshan() {
        //Given
        Mashin benz = new Mashin("benz");
        Mashin volvo = new Mashin("volvo");

        //When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHalHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekadMikonad = volvo.ayaMashinDarHalHarekatAst();

        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekadMikonad);
    }
}
