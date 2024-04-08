package string1.right2;

public class Main {

    public static void main(String[] args) {

        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));


    }

    //    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The
    //    string  length will be at least 2.
    //
    //    right2("Hello") → "loHel"
    //    right2("java") → "vaja"
    //    right2("Hi") → "Hi"
    private static String right2(String str) {
        return (str.length() <= 2) ? str : str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
