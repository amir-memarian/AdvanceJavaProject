package khodro;

import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorTest {
    @Test
    void Motor_Moving_Roshan() {
        //Given
        //Motor motor = new Motor();
        Khodro motor = new Motor();

        //When
        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHalHarekatAst();

        //Then
        assertTrue(ayaHarekatMikonad);
    }
}
