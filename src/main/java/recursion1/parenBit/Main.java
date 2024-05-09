package recursion1.parenBit;

public class Main {

    public static void main(String[] args) {

        System.out.println(parenBit("xyz(abc)1(2)3"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
    }

    //    Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of
    //    the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
    //
    //    parenBit("xyz(abc)123") → "(abc)"
    //    parenBit("x(hello)") → "(hello)"
    //    parenBit("(xy)1") → "(xy)"
    private static String parenBit(String str) {

        if (!str.contains("(")) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int openIndex = str.indexOf("(");
        int closeIndex = str.indexOf(")");

        if (openIndex >= 0 && closeIndex > openIndex) {
            result.append(str, openIndex, closeIndex+1);
        }

        return result + parenBit(str.substring(closeIndex+1));
    }
}
