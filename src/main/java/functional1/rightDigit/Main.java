package functional1.rightDigit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(rightDigit(new ArrayList<>(List.of(1, 22, 93))));
        System.out.println(rightDigit(new ArrayList<>(List.of(16, 8, 886, 8, 1))));
        System.out.println(rightDigit(new ArrayList<>(List.of(10, 0))));
    }

    //    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
    //
    //    rightDigit([1, 22, 93]) → [1, 2, 3]
    //    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    //    rightDigit([10, 0]) → [0, 0]
    private static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
}
