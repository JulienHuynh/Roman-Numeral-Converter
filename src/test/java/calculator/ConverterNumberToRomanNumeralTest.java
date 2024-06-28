package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ConverterNumberToRomanNumeralTest {
    private final ConverterNumberToRomanNumeral converter = new ConverterNumberToRomanNumeral();

    @Test
    public void testconvertNumberToRomanNumeral_1() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(1)).isEqualTo("I");
    }

    @Test
    public void testconvertNumberToRomanNumeral_4() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(4)).isEqualTo("IV");
    }

    @Test
    public void testconvertNumberToRomanNumeral_9() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(9)).isEqualTo("IX");
    }

    @Test
    public void testconvertNumberToRomanNumeral_10() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(10)).isEqualTo("X");
    }

    @Test
    public void testconvertNumberToRomanNumeral_40() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(40)).isEqualTo("XL");
    }

    @Test
    public void testconvertNumberToRomanNumeral_50() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(50)).isEqualTo("L");
    }

    @Test
    public void testconvertNumberToRomanNumeral_90() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(90)).isEqualTo("XC");
    }

    @Test
    public void testconvertNumberToRomanNumeral_100() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(100)).isEqualTo("C");
    }

    @Test
    public void testconvertNumberToRomanNumeral_400() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(400)).isEqualTo("CD");
    }

    @Test
    public void testconvertNumberToRomanNumeral_500() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(500)).isEqualTo("D");
    }

    @Test
    public void testconvertNumberToRomanNumeral_900() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(900)).isEqualTo("CM");
    }

    @Test
    public void testconvertNumberToRomanNumeral_1000() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(1000)).isEqualTo("M");
    }

    @Test
    public void testconvertNumberToRomanNumeral_III() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(3)).isEqualTo("III");
    }

    @Test
    public void testconvertNumberToRomanNumeral_3999() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(3999)).isEqualTo("MMMCMXCIX");
    }

    @Test
    public void testNumberBelowRangeThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(0);
        });
        assertEquals("Le nombre doit être compris entre 1 et 3999", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(-1);
        });
        assertEquals("Le nombre doit être compris entre 1 et 3999", exception.getMessage());
    }

    @Test
    public void testNumberAboveRangeThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(4000);
        });
        assertEquals("Le nombre doit être compris entre 1 et 3999", exception.getMessage());
    }

}