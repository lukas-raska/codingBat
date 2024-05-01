package array2.evenOdd;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2})));
        System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2})));
    }

    //    Return an array that contains the exact same numbers as the given array, but rearranged so that all the
    //    even  numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may
    //    modify and return the given array, or make a new array.
    //
    //    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    //    evenOdd([3, 3, 2]) → [2, 3, 3]
    //    evenOdd([2, 2, 2]) → [2, 2, 2]

    private static int[] evenOdd(int[] nums) {

        int[] evens = Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();
        int[] odds = Arrays.stream(nums).filter(n -> n % 2 != 0).toArray();

       int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = (i < evens.length) ? evens[i] : odds[i- evens.length];
        }

        return result;
    }
}

