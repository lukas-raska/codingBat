package array3.squareUp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println(Arrays.toString(squareUp(2)));
        System.out.println(Arrays.toString(squareUp(4)));
    }

    //    Given n>=0, create an array length n*n with the following pattern,
    //    shown here for n=3 : {0, 0, 1,   0, 2, 1,     3, 2, 1} (spaces added to show the 3 groups).
    //
    //    squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    //    squareUp(2) → [0, 1, 2, 1]
    //    squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    private static int[] squareUp(int n) {

        int[] result = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= (n - 1 - i)) {
                    result[j + i * n] = n - j;
                }
            }
        }
        return result;
    }
}
