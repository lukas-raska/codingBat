package array1.plusTwo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusTwo(new int[]{1,2}, new int[]{3,4})));
        System.out.println(Arrays.toString(plusTwo(new int[]{4,4}, new int[]{2,2})));
        System.out.println(Arrays.toString(plusTwo(new int[]{9,2}, new int[]{3,4})));
    }

    //    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    //
    //    array1.plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    //    array1.plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    //    array1.plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
    private static int[] plusTwo(int[] a,
                                 int[] b) {

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            } else {
                result[i] = b[i - a.length];
            }
        }
        return result;
    }
}
