package string1.nonStart;

public class Main {

    public static void main(String[] args) {

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("a", "b"));
        System.out.println(nonStart("shotl", "java"));

    }


    //    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at
    //    least  length 1.
    //
    //    nonStart("Hello", "There") → "ellohere"
    //    nonStart("java", "code") → "avaode"
    //    nonStart("shotl", "java") → "hotlava"
    private static String nonStart(String a,
                                   String b) {
        return a.substring(1) + b.substring(1);
    }
}
