package warmup2.arrayCount9;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(arrayCount9(new int[]{1, 2, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }

    //    Given an array of ints, return the number of 9's in the array.
    //
    //    arrayCount9([1, 2, 9]) → 1
    //    arrayCount9([1, 9, 9]) → 2
    //    arrayCount9([1, 9, 9, 3, 9]) → 3
    private static int arrayCount9(int[] nums) {
        return Collections.frequency(Arrays.stream(nums).boxed().toList(), 9);
    }
}
