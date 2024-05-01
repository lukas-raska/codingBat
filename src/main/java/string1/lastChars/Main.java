package string1.lastChars;

public class Main {

    public static void main(String[] args) {

        System.out.println(lastChars("last","chars"));
        System.out.println(lastChars("yo","java"));
        System.out.println(lastChars("hi",""));
    }

    //    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo"
    //    and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    //
    //    lastChars("last", "chars") → "ls"
    //    lastChars("yo", "java") → "ya"
    //    lastChars("hi", "") → "h@"
    private static String lastChars(String a,
                                    String b) {
        String first = a.isEmpty()? "@" : ""+ a.charAt(0);
        String last = b.isEmpty()? "@" : "" + b.charAt(b.length()-1);
        return first + last;
    }
}
