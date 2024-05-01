package array2.has12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(has12(new int[]{1, 3, 2}));
        System.out.println(has12(new int[]{3, 1, 2}));
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));
    }

    //    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
    //
    //    has12([1, 3, 2]) → true
    //    has12([3, 1, 2]) → true
    //    has12([3, 1, 4, 5, 2]) → true
    private static boolean has12(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums).boxed().toList();
        int indexOf1 = numsList.indexOf(1);
        int indexOfLast2 = numsList.lastIndexOf(2);

        return indexOf1 >= 0 && indexOfLast2 > indexOf1;
    }
}
