package array2.sum28;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum28(new int[]{2,3,2,2,4,2}));
        System.out.println(sum28(new int[]{2,3,2,2,4,2,2}));
        System.out.println(sum28(new int[]{1,2,3,4}));

    }

    //    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    //
    //    sum28([2, 3, 2, 2, 4, 2]) → true
    //    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    //    sum28([1, 2, 3, 4]) → false
    private static boolean sum28(int[] nums) {
        int sum = Arrays.stream(nums).filter(n -> n == 2).sum();
        return sum == 8;
    }
}
