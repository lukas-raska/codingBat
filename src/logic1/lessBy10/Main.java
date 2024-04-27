package logic1.lessBy10;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(lessBy10(1,7,11));
        System.out.println(lessBy10(1,7,10));
        System.out.println(lessBy10(11,1,7));

    }

    //    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    //
    //    lessBy10(1, 7, 11) → true
    //    lessBy10(1, 7, 10) → false
    //    lessBy10(11, 1, 7) → true
    private static boolean lessBy10(int a,
                                    int b,
                                    int c) {
        int diffAB = Math.abs(a - b);
        int diffAC = Math.abs(a - c);
        int diffBC = Math.abs(b - c);
        int maxDiff = Collections.max(List.of(diffAB, diffAC, diffBC));

        return maxDiff >= 10;
    }
}
