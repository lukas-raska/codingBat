package string1.deFront;

public class Main {

    public static void main(String[] args) {

        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    //    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
    //    keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    //
    //    deFront("Hello") → "llo"
    //    deFront("java") → "va"
    //    deFront("away") → "aay"
    private static String deFront(String str) {
        String front = "";
        if (str.charAt(0) == 'a'){
            front+="a";
        }
        if (str.charAt(1) == 'b'){
            front += "b";
        }
        return front + str.substring(2);
    }
}
