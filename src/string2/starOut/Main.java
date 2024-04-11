package string2.starOut;

public class Main {

    public static void main(String[] args) {

        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }


    //    Return a version of the given string, where for every star (*) in the string the star and the chars
    //    immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
    //
    //    starOut("ab*cd") → "ad"
    //    starOut("ab**cd") → "ad"
    //    starOut("sm*eilly") → "silly"
    private static String starOut(String str) {
        StringBuilder result = new StringBuilder(str.replaceAll("\\*{2,}", "*"));
        int index = 0;
        while (index < result.length()) {
            if (result.charAt(index) == '*') {
                int startIndex = Math.max(index - 1, 0);
                int endIndex = Math.min(index + 2, result.length());
                result.delete(startIndex, endIndex);
            } else {
                index++;
            }
        }
        return result.toString();
    }

}
