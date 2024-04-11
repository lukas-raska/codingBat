package string2.sameStarChar;

public class Main {

    public static void main(String[] args) {

        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }

    //    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after
    //    the star, they are the same.
    //
    //    sameStarChar("xy*yzz") → true
    //    sameStarChar("xy*zzz") → false
    //    sameStarChar("*xa*az") → true
    private static boolean sameStarChar(String str) {
        if (str.isEmpty()) {
            return true;
        }
        boolean hasSameChar = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    hasSameChar = false;
                }
            }
        }
        return hasSameChar;
    }

}
