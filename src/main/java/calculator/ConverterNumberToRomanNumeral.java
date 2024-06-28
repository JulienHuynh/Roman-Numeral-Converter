package calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConverterNumberToRomanNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre:");
        String input = scanner.nextLine();
        scanner.close();

        try {
            String result = convertNumberToRomanNumeral(parseInt(input));
            System.out.println("Résultat: " + result);
        } catch (Exception e) {
            System.out.println("Erreur dans la conversion du nombre en chiffre romain");
        }
    }

    public static String convertNumberToRomanNumeral(int numberToConvert) {
        if (numberToConvert <= 0 || numberToConvert > 3999) {
            throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 3999");
        }

        StringBuilder result = new StringBuilder();
        int remainsToConvert = numberToConvert;
        Map<String, Integer> romanNumeralsValues = getRomanNumeralsValues();

        while (remainsToConvert > 0) {
            for (Map.Entry<String, Integer> entry : romanNumeralsValues.entrySet()) {

                String romanNumeral = entry.getKey(); // ex: "M"
                int value = entry.getValue(); // ex: 1000

                if (remainsToConvert >= value) {
                    int numberOfThisRomanNumeral = remainsToConvert / value;
                    remainsToConvert = remainsToConvert % value;

                    result.append(String.valueOf(romanNumeral).repeat(Math.max(0, numberOfThisRomanNumeral)));
                }

            }
        }

        return result.toString();
    }

    public static Map<String, Integer> getRomanNumeralsValues() {
        Map<String, Integer> romanNumeralsValues = new LinkedHashMap<>();
        romanNumeralsValues.put("M", 1000);
        romanNumeralsValues.put("CM", 900);
        romanNumeralsValues.put("D", 500);
        romanNumeralsValues.put("CD", 400);
        romanNumeralsValues.put("C", 100);
        romanNumeralsValues.put("XC", 90);
        romanNumeralsValues.put("L", 50);
        romanNumeralsValues.put("XL", 40);
        romanNumeralsValues.put("X", 10);
        romanNumeralsValues.put("IX", 9);
        romanNumeralsValues.put("V", 5);
        romanNumeralsValues.put("IV", 4);
        romanNumeralsValues.put("I", 1);

        return romanNumeralsValues;
    }

}