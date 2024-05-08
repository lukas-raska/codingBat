package AP1.copyEndy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(copyEndy(new int[]{9, 11, 90, 22, 6}, 2)));
        System.out.println(Arrays.toString(copyEndy(new int[]{9, 11, 90, 22, 6}, 3)));
        System.out.println(Arrays.toString(copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2)));
    }

    //    We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an
    //    array  of positive ints, return a new array of length "count" containing the first endy numbers from the
    //    original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original
    //    array will contain at least "count" endy numbers.
    //
    //    copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
    //    copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
    //    copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
    private static int[] copyEndy(int[] nums,
                                  int count) {
        return Arrays.stream(nums)
                .filter(n -> (n >= 0 && n <= 10) || (n >= 90 && n <= 100))
                .limit(count)
                .toArray();
    }
}
