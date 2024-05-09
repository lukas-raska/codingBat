package recursion1.strDist;

public class Main {

    public static void main(String[] args) {

        System.out.println(strDist("hiHellohihihi", "hih"));
        System.out.println(strDist("xyx", "z"));
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }

    //    Given a string and a non-empty substring sub, compute recursively the largest substring which starts and
    //    ends with sub and return its length.
    //
    //    strDist("catcowcat", "cat") → 9
    //    strDist("catcowcat", "cow") → 3
    //    strDist("cccatcowcatxx", "cat") → 9


    private static int strDist(String str,
                               String sub) {

        if (str.length() <= sub.length()) {
            return str.equals(sub) ? str.length() : 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        int frontStep = (str.startsWith(sub)) ? 0 : 1;
        int endStep = (str.endsWith(sub)) ? 0 : 1;

        return strDist(str.substring(frontStep, str.length() - endStep), sub);
    }

}
