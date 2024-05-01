package string2.getSandwich;

public class Main {

    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    //    A sandwich is two pieces of bread with something in between. Return the string that is between the first
    //    and last appearance of "bread" in the given string, or return the empty string "" if there are not two
    //    pieces of bread.
    //
    //    getSandwich("breadjambread") → "jam"
    //    getSandwich("xxbreadjambreadyy") → "jam"
    //    getSandwich("xxbreadyy") → ""
    private static String getSandwich(String str) {
        int firstBreadIndex = str.indexOf("bread");
        int lastBreadIndex = str.lastIndexOf("bread");
        if (firstBreadIndex == lastBreadIndex) {
            return "";
        }
        return str.substring(firstBreadIndex + "bread".length(), lastBreadIndex);
    }
}
