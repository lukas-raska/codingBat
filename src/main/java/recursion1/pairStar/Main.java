package recursion1.pairStar;

public class Main {

    public static void main(String[] args) {

        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));

    }
    //    Given a string, compute recursively a new string where identical chars that are adjacent in the original
    //    string are separated from each other by a "*".
    //

    //    pairStar("hello") → "hel*lo"
    //    pairStar("xxyy") → "x*xy*y"
    //    pairStar("aaaa") → "a*a*a*a"
    private static String pairStar(String str) {

        StringBuilder result = new StringBuilder();

        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }

        result.append(str.charAt(0));

        if (str.charAt(0) == str.charAt(1)) {
            result.append("*");
        }
        return result + pairStar(str.substring(1));
    }
}
