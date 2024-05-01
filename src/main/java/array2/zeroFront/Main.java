package array2.zeroFront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{2, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));
        System.out.println(Arrays.toString(zeroFront(new int[]{-1, 0, 0, -1, 0})));
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 3, 0, -3})));

    }

    //    Return an array that contains the exact same numbers as the given array, but rearranged so that all the
    //    zeros are grouped at the start of the array. The order of the non-zero numbers does not matter.  So {1, 0,
    //    0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
    //
    //    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    //    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    //    zeroFront([1, 0]) → [0, 1]
    private static int[] zeroFront(int[] nums) {

        List<Integer> numsList = new ArrayList<>(nums.length);
        for (int num : nums) {
            numsList.add(num);
        }
        numsList.sort(Comparator.comparingInt(num -> num.equals(0) ? -1 : 0));

        return numsList
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
