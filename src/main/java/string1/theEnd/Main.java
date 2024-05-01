package string1.theEnd;

public class Main {

    public static void main(String[] args) {

        System.out.println(theEnd("Hello",true));
        System.out.println(theEnd("Hello",false));
        System.out.println(theEnd("oh",true));


    }

    //    Given a string, return a string length 1 from its front, unless front is false, in which case return a
    //    string length 1 from its back. The string will be non-empty.
    //
    //    theEnd("Hello", true) → "H"
    //    theEnd("Hello", false) → "o"
    //    theEnd("oh", true) → "o"
    private static String theEnd(String str,
                                 boolean front) {
        return front ? "" + str.charAt(0) : "" + str.charAt(str.length() - 1);
    }
}
