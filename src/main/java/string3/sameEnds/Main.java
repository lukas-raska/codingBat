package string3.sameEnds;

public class Main {

    public static void main(String[] args) {

        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
    }

    //    Given a string, return the longest substring that appears at both the beginning and end of the string
    //    without  overlapping. For example, sameEnds("abXab") is "ab".
    //
    //    sameEnds("abXYab") → "ab"
    //    sameEnds("xx") → "x"
    //    sameEnds("xxx") → "x"
    private static String sameEnds(String string) {

        String result = "";

        for (int i = 0; i < string.length() / 2; i++) {

            String start = string.substring(0, i + 1);
            String end = string.substring(string.length() - 1 - i);

            if (start.equals(end)) {
                result = start;
            }
        }
        return result;
    }
}
