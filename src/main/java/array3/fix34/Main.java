package array3.fix34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fix34(new int[]{1,3,1,4})));
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4})));
    }

    //    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3
    //    is  immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains
    //    the  same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the
    //    array  before any 4.
    //
    //    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    //    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    //    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
    private static int[] fix34(int[] nums) {

        List<Integer> fourIndexes = new ArrayList<>();
        List<Integer> threeIndexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==3){
                threeIndexes.add(i);
            }
            if (nums[i]==4){
                fourIndexes.add(i);
            }
        }
        for (int i = 0; i < fourIndexes.size(); i++) {
            int temp = nums[threeIndexes.get(i)+1]; ;
            nums[threeIndexes.get(i)+1]= nums[fourIndexes.get(i)];
            nums[fourIndexes.get(i)] = temp;
        }

        return nums;
        }
    }

