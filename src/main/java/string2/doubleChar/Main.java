package string2.doubleChar;

public class Main {

    public static void main(String[] args) {

        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    //    Given a string, return a string where for every char in the original, there are two chars.
    //
    //    doubleChar("The") → "TThhee"
    //    doubleChar("AAbb") → "AAAAbbbb"
    //    doubleChar("Hi-There") → "HHii--TThheerree"
    private static String doubleChar(String str) {
        StringBuilder result = new StringBuilder(2 * str.length());
        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }
}
