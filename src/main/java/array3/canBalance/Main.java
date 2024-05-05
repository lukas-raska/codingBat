package array3.canBalance;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
    }

    //    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers
    //    on one side is equal to the sum of the numbers on the other side.
    //
    //    canBalance([1, 1, 1, 2, 1]) → true
    //    canBalance([2, 1, 1, 2, 1]) → false
    //    canBalance([10, 10]) → true
    private static boolean canBalance(int[] nums) {
        int leftSideSum = 0;
        int rightSideSum = Arrays.stream(nums).sum();

        for (int num : nums) {
            leftSideSum += num;
            rightSideSum -= num;
            if (leftSideSum == rightSideSum) {
                return true;
            }
        }
        return false;
    }
}
