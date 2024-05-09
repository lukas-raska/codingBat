package recursion1.changePi;

public class Main {

    public static void main(String[] args) {

        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));
    }

    //    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been
    //    replaced by "3.14".
    //
    //    changePi("xpix") → "x3.14x"
    //    changePi("pipi") → "3.143.14"
    //    changePi("pip") → "3.14p"
    private static String changePi(String str) {

        StringBuilder result = new StringBuilder();

        if (str.length() < 2) {
            return result.append(str).toString();
        }

        int step = 1;

        if (str.startsWith("pi")) {
            result.append("3.14");
            step = 2;
        } else {
            result.append(str.charAt(0));
        }

        return result + changePi(str.substring(step));
    }
}

