package string3.countTriple;

public class Main {

    public static void main(String[] args) {

        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }

    //    We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of
    //    triples in the given string. The triples may overlap.
    //
    //    countTriple("abcXXXabc") → 1
    //    countTriple("xxxabyyyycd") → 3
    //    countTriple("a") → 0
    private static int countTriple(String str) {

        int tripleCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            char current = str.charAt(i);
            char next = str.charAt(i+1);
            char overNext = str.charAt(i+2);

            if (current == next && current == overNext){
                tripleCount++;
            }
        }
        return tripleCount;
    }
}
