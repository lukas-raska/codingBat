package string1.endsLy;

public class Main {

    public static void main(String[] args) {

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

    }

    //    Given a string, return true if it ends in "ly".
    //
    //    endsLy("oddly") → true
    //    endsLy("y") → false
    //    endsLy("oddy") → false
    private static boolean endsLy(String str) {
        return str.endsWith("ly");
    }
}
