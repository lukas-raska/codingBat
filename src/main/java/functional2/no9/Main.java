package functional2.no9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(no9(new ArrayList<>(List.of(1,2,19))));
        System.out.println(no9(new ArrayList<>(List.of(9, 19, 29, 3))));
        System.out.println(no9(new ArrayList<>(List.of(1, 2, 3))));
    }

    //    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
    //    (Note: % by 10)
    //
    //    no9([1, 2, 19]) → [1, 2]
    //    no9([9, 19, 29, 3]) → [3]
    //    no9([1, 2, 3]) → [1, 2, 3]
    private static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}
