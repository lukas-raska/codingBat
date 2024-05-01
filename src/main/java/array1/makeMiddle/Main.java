package array1.makeMiddle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeMiddle(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{7,1,2,3,4,9})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1,2})));
    }

    //    Given an array of ints of even length, return a new array length 2 containing the middle two elements from
    //    the original array. The original array will be length 2 or more.
    //
    //    makeMiddle([1, 2, 3, 4]) → [2, 3]
    //    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    //    makeMiddle([1, 2]) → [1, 2]
    private static int[] makeMiddle(int[] nums) {

        return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2]};
    }
}
