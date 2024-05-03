package string3.withoutString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
        System.out.println(withoutString("This is a FISH", "IS"));
    }

    //    Given two strings, base and remove, return a version of the base string where all instances of the remove
    //    string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
    //    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
    //
    //    withoutString("Hello there", "llo") → "He there"
    //    withoutString("Hello there", "e") → "Hllo thr"
    //    withoutString("Hello there", "x") → "Hello there"
    private static String withoutString(String base,
                                        String remove) {

        for (int i = 0; i < base.length() - remove.length(); i++) {
            String tested = base.substring(i, i + remove.length());
            if (tested.equalsIgnoreCase(remove)) {
                base = base.replace(tested, "");
            }
        }
        return base;
    }
}
