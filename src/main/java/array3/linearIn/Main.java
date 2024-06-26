package array3.linearIn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }

    //    Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in
    //    inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage
    //    of the fact that both arrays are already in sorted order.
    //
    //    linearIn([1, 2, 4, 6], [2, 4]) → true
    //    linearIn([1, 2, 4, 6], [2, 3, 4]) → false
    //    linearIn([1, 2, 4, 4, 6], [2, 4]) → true
    private static boolean linearIn(int[] outer,
                                    int[] inner) {

        for (int i = 0; i < inner.length; i++) {
            int currentInner = inner[i];
            if (Arrays.stream(outer).noneMatch(n -> n == currentInner)) {
                return false;
            }
        }
        return true;
    }
}
