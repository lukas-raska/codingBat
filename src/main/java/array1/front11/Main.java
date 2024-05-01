package array1.front11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(front11(new int[]{1, 7}, new int[]{})));
    }

    //    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If
    //    either array is length 0, ignore that array.
    //
    //    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    //    front11([1], [2]) → [1, 2]
    //    front11([1, 7], []) → [1]
    private static int[] front11(int[] a,
                                 int[] b) {


        List<Integer> result = new ArrayList<>(2);
        if (a.length != 0) {
            result.add(a[0]);
        }
        if (b.length != 0) {
            result.add(b[0]);
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
