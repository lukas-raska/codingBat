package string3.mirrorEnds;

public class Main {

    public static void main(String[] args) {

        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));

    }

    //    Given a string, look for a mirror image (backwards) string at both the beginning and end of the given
    //    string.  In other words, zero or more characters at the very begining of the given string, and at the very
    //    end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror
    //    end "ab".
    //
    //    mirrorEnds("abXYZba") → "ab"
    //    mirrorEnds("abca") → "a"
    //    mirrorEnds("aba") → "aba"
    private static String mirrorEnds(String string) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                result.append(string.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
