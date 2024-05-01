package string2.zipZap;

public class Main {

    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));

    }

    //    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    //    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
    //
    //    zipZap("zipXzap") → "zpXzp"
    //    zipZap("zopzop") → "zpzp"
    //    zipZap("zzzopzop") → "zzzpzp"
    private static String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            if (str.substring(index).length() < 3) {
                result.append(str.substring(index));
                break;
            } else {
                if (str.charAt(index) == 'z' && str.charAt(index + 2) == 'p') {
                    result.append(str.charAt(index)).append(str.charAt(index + 2));
                    index += 3;
                } else {
                    result.append(str.charAt(index));
                    index++;
                }
            }
        }
        return result.toString();
    }

}
