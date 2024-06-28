package calculator;

public class ConverterNumberToRomanNumeral {
    public static void main(String[] args) {

        String result = convertNumberToRomanNumeral(1);
        System.out.println(result);
    }

    public static String convertNumberToRomanNumeral(int numberToConvert) {
        StringBuilder result = new StringBuilder();

            if (numberToConvert == 1) {
                result.append("I");
            }

        return result.toString();
    }

}