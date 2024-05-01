package array2.twoTwo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));

    }

    //    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
    //
    //    twoTwo([4, 2, 2, 3]) → true
    //    twoTwo([2, 2, 4]) → true
    //    twoTwo([2, 2, 4, 2]) → false
    private static boolean twoTwo(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int previous = (i - 1 >= 0) ? nums[i - 1] : 0;
            int current = nums[i];
            int next = ((i + 1) < nums.length) ? nums[i + 1] : 0;
            if (current == 2 && next != 2 && previous != 2) {
                return false;
            }
        }
        return true;
    }
}
