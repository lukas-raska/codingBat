package AP1.copyEvens;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 2)));
        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 3)));
        System.out.println(Arrays.toString(copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3)));
    }

    //    Given an array of positive ints, return a new array of length "count" containing the first even numbers
    //    from the original array. The original array will contain at least "count" even numbers.
    //
    //    copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
    //    copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
    //    copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
    private static int[] copyEvens(int[] nums,
                                   int count) {
        return Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .limit(count)
                .toArray();
    }
}
