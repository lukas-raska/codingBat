package string2.xyzThere;

public class Main {

    public static void main(String[] args) {

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    //    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
    //    a  period (.). So "xxyz" counts but "x.xyz" does not.
    //
    //    xyzThere("abcxyz") → true
    //    xyzThere("abc.xyz") → false
    //    xyzThere("xyz.abc") → true
    private static boolean xyzThere(String str) {
        String strCopy = str;
        boolean result = false;
        while (strCopy.contains("xyz")) {
            int indexOfDot = strCopy.indexOf('.');
            int indexOfXYZ = strCopy.indexOf("xyz");
            if (indexOfDot == -1) {
                result = indexOfXYZ >= 0;
            } else {
                result = indexOfDot != indexOfXYZ - 1;
            }
            strCopy = strCopy.substring(indexOfXYZ + "xyz".length());
        }

        return result;
    }
}
