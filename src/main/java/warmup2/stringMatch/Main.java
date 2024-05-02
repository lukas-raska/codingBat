package warmup2.stringMatch;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    //    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring
    //    .  So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place
    //    in  both strings.
    //
    //    stringMatch("xxcaazz", "xxbaaz") → 3
    //    stringMatch("abc", "abc") → 2
    //    stringMatch("abc", "axc") → 0
    private static int stringMatch(String a,
                                   String b) {

        int count = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()) - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }
}
