package string3.sumNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumNumbers("abc123xyz"));
                System.out.println(sumNumbers("aa11b33"));
                System.out.println(sumNumbers("7 11"));
                System.out.println(sumNumbers("Chocolate"));
    }

    //    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A
    //    number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one
    //    of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
    //
    //    sumNumbers("abc123xyz") → 123
    //    sumNumbers("aa11b33") → 44
    //    sumNumbers("7 11") → 18
    private static int sumNumbers(String str) {

        StringBuilder modifiedStr = new StringBuilder();
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                modifiedStr.append(c);
            } else {
                modifiedStr.append(" ");
            }
        }
        String[] numbersAsStrings = modifiedStr.toString().trim().split("\\s+");

        for (String number : numbersAsStrings) {
            if (!number.isBlank()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }


}
