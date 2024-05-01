package array2.notAlone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3}, 2)));
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2)));
        System.out.println(Arrays.toString(notAlone(new int[]{3, 4}, 3)));

    }

    //    We'll say that an element in an array is "alone" if there are values before and after it, and those values
    //    are different from it. Return a version of the given array where every instance of the given value which is
    //    alone is replaced by whichever value to its left or right is larger.
    //
    //    notAlone([1, 2, 3], 2) → [1, 3, 3]
    //    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    //    notAlone([3, 4], 3) → [3, 4]
    private static int[] notAlone(int[] nums,
                                  int val) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1) {
                result[i] = nums[i];
            } else {
                int current = nums[i];
                int next = nums[i + 1];
                int prev = nums[i - 1];
                if (current == val && current != prev && current != next) {
                    result[i] = Math.max(prev, next);
                } else {
                    result[i] = nums[i];
                }
            }
        }
        return result;
    }

}
