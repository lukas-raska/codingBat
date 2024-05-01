package array2.tenRun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(tenRun(new int[]{2, 10, 3, 4, 20, 5})));
        System.out.println(Arrays.toString(tenRun(new int[]{ 10, 1,  20, 2})));
        System.out.println(Arrays.toString(tenRun(new int[]{ 10, 1, 9, 20})));

    }

    //    For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
    //    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
    //
    //    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    //    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    //    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
    private static int[] tenRun(int[] nums) {

        int[] result = new int[nums.length];
        boolean tenFound = false;
        int currentTen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 != 0 && !tenFound) {
                result[i] = nums[i];
            }
            if (nums[i] % 10 == 0) {
                tenFound = true;
                currentTen = nums[i];
            }
            if (tenFound) {
                result[i] = currentTen;
            }

        }
        return result;
    }
}
