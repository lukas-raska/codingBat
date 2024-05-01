package array2.post4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(post4(new int[]{2, 4, 1, 2})));
        System.out.println(Arrays.toString(post4(new int[]{2, 4, 4, 2})));
        System.out.println(Arrays.toString(post4(new int[]{4, 4, 1, 2, 3})));

    }

    //    Given a non-empty array of ints, return a new array containing the elements from the original array that
    //    come after the last 4 in the original array. The original array will contain at least one 4. Note that it
    //    is valid in java to create an array of length 0.
    //
    //    post4([2, 4, 1, 2]) → [1, 2]
    //    post4([4, 1, 4, 2]) → [2]
    //    post4([4, 4, 1, 2, 3]) → [1, 2, 3]
    private static int[] post4(int[] nums) {

        int indexOfLast4 = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                indexOfLast4 = i;
                break;
            }
        }

        return Arrays.copyOfRange(nums, indexOfLast4 + 1, nums.length);
    }
}
