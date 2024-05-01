package array2.zeroMax;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(zeroMax(new int[]{0, 5, 0, 3})));
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 4, 0, 3})));
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 1, 0})));
    }

    //    Return a version of the given array where each zero value in the array is replaced by the largest odd value
    //    to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as
    //    a zero.
    //
    //    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    //    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    //    zeroMax([0, 1, 0]) → [1, 1, 0]
    private static int[] zeroMax(int[] nums) {

        int index = 0;

        while (index < nums.length - 1) {

            //finding the max odd value
            int maxOddValue = Integer.MIN_VALUE;
            int maxOddValueIndex = -1;

            for (int i = index; i < nums.length; i++) {
                if (nums[i] % 2 != 0 && nums[i] > maxOddValue) {
                    maxOddValue = nums[i];
                    maxOddValueIndex = i;
                }
            }

            // if found, replace zeros with it
            if (maxOddValueIndex != -1) {
                for (int i = index; i < maxOddValueIndex; i++) {
                    if (nums[i] == 0) {
                        nums[i] = maxOddValue;
                    }
                }
                index = maxOddValueIndex+1;
            } else {
                index = nums.length;
            }

        }
        return nums;
    }
}


