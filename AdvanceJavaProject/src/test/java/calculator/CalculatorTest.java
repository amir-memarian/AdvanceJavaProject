package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void Bayad_do_adad_ra_ba_ham_jam_konid() {
        Calculator calculator = new Calculator();

        String haselJamDoAdad=calculator.calcute("5.3" , "-2","+");

        assertEquals("3.3",haselJamDoAdad);
    }
    @Test
    void Bayad_NumberFormatException_ra_tolid_konid_agar_adad_sahih_nist() {
        Calculator calculator = new Calculator();

        assertThatExceptionOfType(NumberFormatException.class)
                .isThrownBy(()->calculator.calcute("6.......","2","+"));

    }

}
