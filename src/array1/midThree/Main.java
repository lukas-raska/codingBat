package array1.midThree;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(midThree(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(midThree(new int[]{8,6,7,5,3,0,9})));
        System.out.println(Arrays.toString(midThree(new int[]{1,2,3})));

    }

    //    Given an array of ints of odd length, return a new array length 3 containing the elements from the middle
    //    of  the array. The array length will be at least 3.
    //
    //    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    //    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    //    midThree([1, 2, 3]) → [1, 2, 3]
    private static int[] midThree(int[] nums) {

        int middleIndex = nums.length / 2;

        return new int[]{nums[middleIndex - 1], nums[middleIndex], nums[middleIndex + 1]};
    }
}
