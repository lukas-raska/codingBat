package array1.reverse3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverse3(new int[]{7, 0, 0})));

    }

    //    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
    //    becomes {3, 2, 1}.
    //
    //    reverse3([1, 2, 3]) → [3, 2, 1]
    //    reverse3([5, 11, 9]) → [9, 11, 5]
    //    reverse3([7, 0, 0]) → [0, 0, 7]
    private static int[] reverse3(int[] nums) {

        int[] reversed = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }

        return reversed;
    }
}
