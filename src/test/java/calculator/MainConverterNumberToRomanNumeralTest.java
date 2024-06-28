package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainConverterNumberToRomanNumeralTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream originalIn = new ByteArrayInputStream(new byte[0]);
    private final ConverterNumberToRomanNumeral converter = new ConverterNumberToRomanNumeral();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testValidInput() {
        String input = "10";
        String expectedOutput = "Entrez un nombre:\nRésultat: X\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConverterNumberToRomanNumeral.main(new String[]{});

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testInvalidInput() {
        String input = "abc";
        String expectedOutput = "Entrez un nombre:\nErreur dans la conversion du nombre en chiffre romain\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConverterNumberToRomanNumeral.main(new String[]{});

        assertEquals(expectedOutput, outContent.toString());
    }
}
