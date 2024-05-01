package array2.centeredAverage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println(centeredAverage(new int[]{1,2,3,4,100}));
        System.out.println(centeredAverage(new int[]{1,1,5,5,10,8,7}));
        System.out.println(centeredAverage(new int[]{-10,-4,-2,-4,-2,0}));

    }

    //    Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
    //    except  ignoring the largest and smallest values in the array. If there are multiple copies of the smallest
    //    value, ignore just one copy, and likewise for the largest value. Use int division to produce the final
    //    average. You may assume that the array is length 3 or more.
    //
    //    centeredAverage([1, 2, 3, 4, 100]) → 3
    //    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    //    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
    private static int centeredAverage(int[] nums) {

        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        int sum = 0;
        for (int i = 1; i < numsCopy.length - 1; i++) {
            sum += numsCopy[i];
        }
        return sum / (numsCopy.length - 2);
    }

}
