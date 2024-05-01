package string2.endOther;

public class Main {

    public static void main(String[] args) {

        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }

    //    Given two strings, return true if either of the strings appears at the very end of the other string,
    //    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    //    Note: str.toLowerCase() returns the lowercase version of a string.
    //
    //    endOther("Hiabc", "abc") → true
    //    endOther("AbC", "HiaBc") → true
    //    endOther("abc", "abXabc") → true
    private static boolean endOther(String a,
                                    String b) {
        String aToLower = a.toLowerCase();
        String bToLower = b.toLowerCase();
        return aToLower.endsWith(bToLower) || bToLower.endsWith(aToLower);
    }
}
