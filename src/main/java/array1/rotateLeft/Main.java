package array1.rotateLeft;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{7, 0, 0})));

    }

    //    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    //
    //    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    //    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    //    rotateLeft3([7, 0, 0]) → [0, 0, 7]
    private static int[] rotateLeft3(int[] nums) {

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[(i + 1) % nums.length];
        }
        return output;
    }

}
