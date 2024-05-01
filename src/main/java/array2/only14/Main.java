package array2.only14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(only14(new int[]{1,4,1,4}));
        System.out.println(only14(new int[]{1,4,2,4}));
        System.out.println(only14(new int[]{1,1}));

    }

    //    Given an array of ints, return true if every element is a 1 or a 4.
    //
    //    only14([1, 4, 1, 4]) → true
    //    only14([1, 4, 2, 4]) → false
    //    only14([1, 1]) → true
    private static boolean only14(int[] nums) {

        int [] only14array = Arrays.stream(nums)
                .filter(n -> n == 1 || n == 4)
                .toArray();

        return only14array.length == nums.length;
    }
}
