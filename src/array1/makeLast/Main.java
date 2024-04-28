package array1.makeLast;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makeLast(new int[]{4,5,6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1,2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));

    }

    //    Given an int array, return a new array with double the length where its last element is the same as the
    //    original array, and all the other elements are 0. The original array will be length 1 or more. Note: by
    //    default, a new int array contains all 0's.
    //
    //    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    //    makeLast([1, 2]) → [0, 0, 0, 2]
    //    makeLast([3]) → [0, 3]
    private static int[] makeLast(int[] nums) {

        int[] output = new int[2 * nums.length];
        output[output.length - 1] = nums[nums.length - 1];

        return output;
    }
}
