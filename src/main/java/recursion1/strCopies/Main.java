package recursion1.strCopies;

public class Main {

    public static void main(String[] args) {

        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }

    //    Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
    //
    //    strCopies("catcowcat", "cat", 2) → true
    //    strCopies("catcowcat", "cow", 2) → false
    //    strCopies("catcowcat", "cow", 1) → true
    private static boolean strCopies(String str,
                                     String sub,
                                     int n) {
        if (str.length() < sub.length()) {
            return n == 0;
        }

        int count = 0;

        if (str.startsWith(sub)) {
            count++;
        }

        return strCopies(str.substring(1), sub, n - count);


    }
}
