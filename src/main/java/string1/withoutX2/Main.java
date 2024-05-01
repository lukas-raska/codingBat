package string1.withoutX2;

public class Main {

    public static void main(String[] args) {

        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    //    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and
    //    otherwise return the string unchanged. This is a little harder than it looks.
    //
    //    withoutX2("xHi") → "Hi"
    //    withoutX2("Hxi") → "Hi"
    //    withoutX2("Hi") → "Hi"
    private static String withoutX2(String str) {
        switch (str.length()) {
            case 0:
                return str;
            case 1:
                return (str.charAt(0) == 'x') ? "" : str;
            default:
                String first = (str.charAt(0) == 'x') ? "" : "" + str.charAt(0);
                String second = (str.charAt(1) == 'x') ? "" : "" + str.charAt(1);
                String rest = str.substring(2);
                return first + second + rest;
        }
    }
}
