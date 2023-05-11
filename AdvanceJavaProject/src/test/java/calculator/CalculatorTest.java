package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void Bayad_do_adad_ra_ba_ham_jam_konid() {
        Calculator calculator = new Calculator();

        String haselJamDoAdad=calculator.calcute("5.3" , "-2","+");

        assertEquals("3.3",haselJamDoAdad);
    }
}
