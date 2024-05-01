package string1.firstHalf;

public class Main {

    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }


    //    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    //
    //    firstHalf("WooHoo") → "Woo"
    //    firstHalf("HelloThere") → "Hello"
    //    firstHalf("abcdef") → "abc"
    private static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


}
