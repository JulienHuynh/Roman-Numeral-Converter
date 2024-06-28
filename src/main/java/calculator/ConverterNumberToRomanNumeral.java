package calculator;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConverterNumberToRomanNumeral {
    public static void main(String[] args) {

        String result = convertNumberToRomanNumeral(1);
        System.out.println(result);
    }

    public static String convertNumberToRomanNumeral(int numberToConvert) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> romanNumeralsValues = getRomanNumeralsValues();

        for (Map.Entry<String, Integer> entry : romanNumeralsValues.entrySet()) {
            if (entry.getValue() == numberToConvert) {
                result.append(entry.getKey());
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