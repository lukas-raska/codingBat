package array2.no14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(no14(new int[]{1,2,3}));
        System.out.println(no14(new int[]{1,2,3,4}));
        System.out.println(no14(new int[]{2,3,4}));

    }

    //    Given an array of ints, return true if it contains no 1's or it contains no 4's.
    //
    //    no14([1, 2, 3]) → true
    //    no14([1, 2, 3, 4]) → false
    //    no14([2, 3, 4]) → true
    private static boolean no14(int[] nums) {

        long onesCount = Arrays.stream(nums).filter(n -> n == 1).count();
        long foursCount = Arrays.stream(nums).filter(n -> n == 4).count();

        return onesCount == 0 || foursCount == 0;
    }
}
