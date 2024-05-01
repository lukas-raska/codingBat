package string2.oneTwo;

public class Main {

    public static void main(String[] args) {

        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }

    //    Given a string, compute a new string by moving the first char to come after the next two chars, so "abc"
    //    yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore
    //    any group of fewer than 3 chars at the end.
    //
    //    oneTwo("abc") → "bca"
    //    oneTwo("tca") → "cat"
    //    oneTwo("tcagdo") → "catdog"
    private static String oneTwo(String str) {
        int tailIndex = str.length() - str.length() % 3;
        String strWithoutTail = str.substring(0, tailIndex);
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < strWithoutTail.length(); i += 3) {
            result.append(strWithoutTail, i + 1, i + 3).append(strWithoutTail.charAt(i));
        }
        return result.toString();
    }
}
