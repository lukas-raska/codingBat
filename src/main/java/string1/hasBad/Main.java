package string1.hasBad;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }

    //    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx"
    //    or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2
    //    strings.
    //
    //    hasBad("badxx") → true
    //    hasBad("xbadxx") → true
    //    hasBad("xxbadxx") → false
    private static boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad",1);
    }
}
