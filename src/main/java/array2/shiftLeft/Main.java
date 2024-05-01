package array2.shiftLeft;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1})));

    }

    //    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and
    //    return the given array, or return a new array.
    //
    //    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    //    shiftLeft([1, 2]) → [2, 1]
    //    shiftLeft([1]) → [1]
    private static int[] shiftLeft(int[] nums) {

        if (nums.length > 0) {
            int first = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = first;
        }

        return nums;
    }
}
