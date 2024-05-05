package array3.maxMirror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
        System.out.println(maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        System.out.println(maxMirror(new int[]{1, 2, 3, 3, 8}));
        System.out.println(maxMirror(new int[]{1, 2, 7, 8, 1, 7, 2}));


    }

    //    We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the
    //    array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9,
    //    3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given
    //    array.
    //
    //    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
    //    maxMirror([1, 2, 1, 4]) → 3
    //    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

    private static int maxMirror(int[] nums) {

        int maxLength = (nums.length == 0) ? 0 : 1;
        int currentLength = nums.length; //start testing with max possible length


        int[] numsReversed = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsReversed[i] = nums[nums.length - 1 - i];
        }
        boolean isMirrored = false;

        while (currentLength > 0 && !isMirrored) {

            for (int i = 0; i <= nums.length - currentLength; i++) {
                int[] tested = Arrays.copyOfRange(nums, i, i + currentLength);

                for (int j = 0; j <= numsReversed.length - currentLength; j++) {
                    int[] numsRevTested = Arrays.copyOfRange(numsReversed, j, j + currentLength);
                    if (Arrays.equals(numsRevTested, tested)) {
                        isMirrored = true;
                        maxLength = currentLength;
                        break;
                    }
                }
                if (isMirrored) {
                    break;
                }
            }
            currentLength--;
        }

        return maxLength;
    }


}
