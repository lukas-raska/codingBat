package recursion1.noX;

public class Main {

    public static void main(String[] args) {

        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }

    //    Given a string, compute recursively a new string where all the 'x' chars have been removed.
    //
    //    noX("xaxb") → "ab"
    //    noX("abc") → "abc"
    //    noX("xx") → ""
    private static String noX(String str) {

        StringBuilder result = new StringBuilder();

        if (str.isEmpty()) {
            return "";
        }
        if (!str.startsWith("x")) {
            result.append(str.charAt(0));
        }

        return result + noX(str.substring(1));
    }
}
