package logic2.evenlySpaced;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println(evenlySpaced(2,4,6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
    }

    //    Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three
    //    values are evenly spaced, so the difference between small and medium is the same as the difference between
    //    medium and large.
    //
    //    evenlySpaced(2, 4, 6) → true
    //    evenlySpaced(4, 6, 2) → true
    //    evenlySpaced(4, 6, 3) → false
    private static boolean evenlySpaced(int a,
                                        int b,
                                        int c) {

       int[] numbers = IntStream.of(a, b, c).sorted().toArray();
//        int[] numbers = {a, b, c};
//        Arrays.sort(numbers);
        int small = numbers[0];
        int medium = numbers[1];
        int large = numbers[2];

        return (large - medium) == (medium - small);
    }
}
