package array1.maxTriple;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(maxTriple(new int[]{1,2,3}));
        System.out.println(maxTriple(new int[]{1,5,3}));
        System.out.println(maxTriple(new int[]{5,2,3}));
    }

    //    Given an array of ints of odd length, look at the first, last, and middle values in the array and return
    //    the largest. The array length will be a least 1.
    //
    //    maxTriple([1, 2, 3]) → 3
    //    maxTriple([1, 5, 3]) → 5
    //    maxTriple([5, 2, 3]) → 5
    private static int maxTriple(int[] nums) {

        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return Collections.max(List.of(first, middle, last));
    }
}
