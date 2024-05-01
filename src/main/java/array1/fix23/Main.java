package array1.fix23;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix23(new int[]{1,2,3})));
        System.out.println(Arrays.toString(fix23(new int[]{2,3,5})));
        System.out.println(Arrays.toString(fix23(new int[]{1,2,1})));
    }

    //    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element
    //    to 0. Return the changed array.
    //
    //    fix23([1, 2, 3]) → [1, 2, 0]
    //    fix23([2, 3, 5]) → [2, 0, 5]
    //    fix23([1, 2, 1]) → [1, 2, 1]
    private static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

}
