package logic2.noTeenSum;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(noTeenSum(1,2,3));
        System.out.println(noTeenSum(2,13,1));
        System.out.println(noTeenSum(2,1,14));
    }

    //    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
    //    inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper
    //    "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In
    //    this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at
    //    the same indent level as the main noTeenSum().
    //
    //    noTeenSum(1, 2, 3) → 6
    //    noTeenSum(2, 13, 1) → 3
    //    noTeenSum(2, 1, 14) → 3
    private static int noTeenSum(int a,
                                 int b,
                                 int c) {
        List<Integer>numbers = Arrays.asList(a,b,c);
        return numbers.stream()
                .mapToInt(Main::fixTeen)
                .sum();
    }

    private static int fixTeen(int n) {
        List<Integer> teenValues = List.of(13, 14, 17, 18, 19);
        return teenValues.contains(n) ? 0 : n;
    }
}
