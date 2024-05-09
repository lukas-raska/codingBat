package recursion1.stringClean;

public class Main {

    public static void main(String[] args) {

                System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));

    }

    //    Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been
    //    reduced to a single char. So "yyzzza" yields "yza".
    //
    //    stringClean("yyzzza") → "yza"
    //    stringClean("abbbcdd") → "abcd"
    //    stringClean("Hello") → "Helo"
    private static String stringClean(String str) {

        if (str.length() < 2) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        int step = 1;

        char current = str.charAt(0);
        char next = str.charAt(step);

        while (next == current && ++step < str.length()) {
            next = str.charAt(step);
        }

        result.append(current);

        return result + stringClean(str.substring(step));


    }
}
