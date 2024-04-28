package array1.bigger2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
    }

    //    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the
    //    array which has the largest sum. In event of a tie, return a.
    //
    //    biggerTwo([1, 2], [3, 4]) → [3, 4]
    //    biggerTwo([3, 4], [1, 2]) → [3, 4]
    //    biggerTwo([1, 1], [1, 2]) → [1, 2]
    private static int[] biggerTwo(int[] a,
                                   int[] b) {

        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        return (sumA >= sumB) ? a : b;
    }

}
