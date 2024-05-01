package string1.withoutEnd2;

public class Main {

    public static void main(String[] args) {

        System.out.println(withoutEnd2("Hello"));
        System.out.println(withoutEnd2("abc"));
        System.out.println(withoutEnd2("ab"));

    }

    //    Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
    //
    //    withouEnd2("Hello") → "ell"
    //    withouEnd2("abc") → "b"
    //    withouEnd2("ab") → ""
    private static String withoutEnd2(String str) {
        return (str.length() <= 2) ? "" : str.substring(1, str.length() - 1);
    }
}
