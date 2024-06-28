package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterNumberToRomanNumeralTest {
    private final ConverterNumberToRomanNumeral converter = new ConverterNumberToRomanNumeral();

    @Test
    public void testconvertNumberToRomanNumeral_1() {
        assertThat(ConverterNumberToRomanNumeral.convertNumberToRomanNumeral(1)).isEqualTo("I");
    }

}