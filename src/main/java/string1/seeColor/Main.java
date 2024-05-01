package string1.seeColor;

public class Main {

    public static void main(String[] args) {

        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    //    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the
    //    empty string.
    //
    //    seeColor("redxx") → "red"
    //    seeColor("xxred") → ""
    //    seeColor("blueTimes") → "blue"
    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
