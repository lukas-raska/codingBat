package array3.maxSpan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }

    //    Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the
    //    number of elements between the two inclusive. A single value has a span of 1. Returns the largest span
    //    found  in the given array. (Efficiency is not a priority.)
    //
    //    maxSpan([1, 2, 1, 1, 3]) → 4
    //    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    //    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    private static int maxSpan(int[] nums) {

        int maxSpan = 0;
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();

        for (Integer num : numsList) {
            maxSpan = Math.max(maxSpan, numsList.lastIndexOf(num) - numsList.indexOf(num) + 1);
        }

        return maxSpan;
    }
}
