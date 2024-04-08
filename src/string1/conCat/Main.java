package string1.conCat;

public class Main {

    public static void main(String[] args) {

        System.out.println(concat("abc","cat"));
        System.out.println(concat("dog","cat"));
        System.out.println(concat("abc",""));


    }

    //    Given two strings, append them together (known as "concatenation") and return the result. However, if the
    //    concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    //
    //    conCat("abc", "cat") → "abcat"
    //    conCat("dog", "cat") → "dogcat"
    //    conCat("abc", "") → "abc"
    private static String concat(String a,
                                 String b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }
}
