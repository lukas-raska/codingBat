package string1.extraEnd;

public class Main {

    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));

    }

    //    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
    //    length will be at least 2.
    //
    //    extraEnd("Hello") → "lololo"
    //    extraEnd("ab") → "ababab"
    //    extraEnd("Hi") → "HiHiHi"
    private static String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end.repeat(3);
    }
}
