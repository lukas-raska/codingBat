package recursion1.count11;

public class Main {

    public static void main(String[] args) {

        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));

    }

    //    Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11"
    //    substrings should not overlap.
    //
    //    count11("11abc11") → 2
    //    count11("abc11x11x11") → 3
    //    count11("111") → 1
    private static int count11(String str) {

        if (str.length() < 2) {
            return 0;
        }

        int count = 0;
        int step = 1;

        if (str.startsWith("11")) {
            count++;
            step = 2;
        }
        return count + count11(str.substring(step));
    }
}
