package string1.withoutX;

public class Main {

    public static void main(String[] args) {

        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    //    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
    //    otherwise  return the string unchanged.
    //
    //    withoutX("xHix") → "Hi"
    //    withoutX("xHi") → "Hi"
    //    withoutX("Hxix") → "Hxi"
    private static String withoutX(String str) {
        switch (str.length()) {
            case 0:
                return "";
            case 1:
                return str.equals("x") ? "" : str;
            default:
                String first = (str.charAt(0) == 'x') ? "" : "" + str.charAt(0);
                String last = (str.charAt(str.length() - 1) == 'x') ? "" : "" + str.charAt(str.length() - 1);
                return first + str.substring(1, str.length() - 1) + last;
        }
    }
}
