package string2.mixString;

public class Main {

    public static void main(String[] args) {

        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    //    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the
    //    second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
    //
    //    mixString("abc", "xyz") → "axbycz"
    //    mixString("Hi", "There") → "HTihere"
    //    mixString("xxxx", "There") → "xTxhxexre"
    private static String mixString(String a,
                                    String b) {
        String shorter = (a.length()<b.length())? a:b;
        String longer = (a.equals(shorter))? b:a;
        StringBuilder result = new StringBuilder(a.length() + b.length());
        for (int i = 0; i < shorter.length(); i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        result.append(longer.substring(shorter.length()));
        return result.toString();
    }

}

