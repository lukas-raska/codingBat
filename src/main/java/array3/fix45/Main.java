package array3.fix45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix45(new int[]{4, 5, 4, 1, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 5, 4, 1})));
        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }

    //(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same
    // numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the
    // 4's,  but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a
    // number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
    //
    //    fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
    //    fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
    //    fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
    private static int[] fix45(int[] nums) {
        //find all the fours and fives in array and store their indexes
        List<Integer> fourIndexes = new ArrayList<>();
        List<Integer> fiveIndexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) { //store index of 4 only if next !=5
                int next = ((i + 1) < nums.length) ? i + 1 : i;
                if (nums[next] != 5) {
                    fourIndexes.add(i);
                }
            }
            if (nums[i] == 5) { //store index of 5 only if previous != 4
                int prev = ((i - 1) >= 0) ? i - 1 : i;
                if (nums[prev] != 4) {
                    fiveIndexes.add(i);
                }
            }
        }

        //loop through stored indexes and swap numbers
        for (int i = 0; i < fourIndexes.size(); i++) {
            int temp = nums[fourIndexes.get(i) + 1];
            nums[fourIndexes.get(i) + 1] = nums[fiveIndexes.get(i)];
            nums[fiveIndexes.get(i)] = temp;
        }

        return nums;
    }
}
