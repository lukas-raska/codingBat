package recursion1.nestParen;

public class Main {

    public static void main(String[] args) {

//        System.out.println(nestParen("((y)))"));
//        System.out.println(nestParen("((())"));
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
    }

    //    Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))
    //    ".  Suggestion: check the first and last chars, and then recur on what's inside them.
    //
    //    nestParen("(())") → true
    //    nestParen("((()))") → true
    //    nestParen("(((x))") → false
    private static boolean nestParen(String str) {

        if (str.length() <= 2) {
            if (str.length() == 2) {
                return str.contains("(") && str.indexOf("(") < str.indexOf(")");
            } else if (str.length()==1) {
                return !str.contains("(") && !str.contains(")");
            } else {
                return true;
            }
        }
        int openingIndex = str.indexOf("(");
        int closingIndex = str.lastIndexOf(")");

        boolean outerParenCheck = openingIndex >= 0 && closingIndex > openingIndex;
        boolean innerParenCheck = nestParen(str.substring(openingIndex + 1, closingIndex));

        return outerParenCheck && innerParenCheck;
    }
}
