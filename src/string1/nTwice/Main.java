package string1.nTwice;

public class Main {

    public static void main(String[] args) {

        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
        System.out.println(nTwice("Hello", 5));



    }

    //    Given a string and an int n, return a string made of the first and last n chars from the string. The string
    //    length will be at least n.
    //
    //    nTwice("Hello", 2) → "Helo"
    //    nTwice("Chocolate", 3) → "Choate"
    //    nTwice("Chocolate", 1) → "Ce"
    private static String nTwice(String str,
                                 int n) {
        String front = str.substring(0, n);
        String end = str.substring(str.length() - n);
        return front + end;
    }
}
