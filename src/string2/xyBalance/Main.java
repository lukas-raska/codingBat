package string2.xyBalance;

public class Main {

    public static void main(String[] args) {

        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    //    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
    //    somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    //    Return true if the given string is xy-balanced.
    //
    //    xyBalance("aaxbby") → true
    //    xyBalance("aaxbb") → false
    //    xyBalance("yaaxbb") → false
    private static boolean xyBalance(String str) {
        int lastY = str.lastIndexOf('y');
        int lastX = str.lastIndexOf('x');
        return lastY>=lastX;
    }
}
