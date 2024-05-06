package functional1.math1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(math1(new ArrayList<>(List.of(1,2,3))));
        System.out.println(math1(new ArrayList<>(List.of(6, 8, 6, 8, 1))));
        System.out.println(math1(new ArrayList<>(List.of(10))));
    }

    //    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
    //
    //    math1([1, 2, 3]) → [20, 30, 40]
    //    math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
    //    math1([10]) → [110]
    private static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
}
