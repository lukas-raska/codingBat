package array1.makePi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makePi()));

    }

    //    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    //
    //    makePi() → [3, 1, 4]
    private static int[] makePi() {
        return new int[]{3, 1, 4};
    }
}
