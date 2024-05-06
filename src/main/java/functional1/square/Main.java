package functional1.square;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(square(new ArrayList<>(List.of(1, 2, 3))));
        System.out.println(square(new ArrayList<>(List.of(6, 8, -6, -8, 1))));
        System.out.println(square(new ArrayList<>(List.of())));

    }

    //    Given a list of integers, return a list where each integer is multiplied with itself.
    //
    //    square([1, 2, 3]) → [1, 4, 9]
    //    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    //    square([]) → []
    private static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}
