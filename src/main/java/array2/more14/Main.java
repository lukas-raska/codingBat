package array2.more14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(more14(new int[]{1,4,1}));
        System.out.println(more14(new int[]{1,4,1,4}));
        System.out.println(more14(new int[]{1,1}));

    }

    //    Given an array of ints, return true if the number of 1's is greater than the number of 4's
    //
    //    more14([1, 4, 1]) → true
    //    more14([1, 4, 1, 4]) → false
    //    more14([1, 1]) → true
    private static boolean more14(int[] nums) {

        long onesCount = Arrays.stream(nums).filter(n -> n == 1).count();
        long foursCount = Arrays.stream(nums).filter(n -> n == 4).count();

        return onesCount > foursCount;
    }

}
