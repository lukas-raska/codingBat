package array2.bigDiff;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println(bigDiff(new int[]{10,3,5,6}));
        System.out.println(bigDiff(new int[]{7,2,10,9}));
        System.out.println(bigDiff(new int[]{2,10,7,2}));

    }

    //    Given an array length 1 or more of ints, return the difference between the largest and smallest values in
    //    the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger
    //    of two values.
    //
    //    bigDiff([10, 3, 5, 6]) → 7
    //    bigDiff([7, 2, 10, 9]) → 8
    //    bigDiff([2, 10, 7, 2]) → 8
    private static int bigDiff(int[] nums) {

        int max = Arrays.stream(nums).max().orElse(nums[0]);
        int min = Arrays.stream(nums).min().orElse(nums[0]);

        return max - min;
    }
}
