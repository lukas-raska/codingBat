package array2.sameEnds;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(sameEnds(new int[]{5,6,45,99,13,5,6},1));
        System.out.println(sameEnds(new int[]{5,6,45,99,13,5,6},2));
        System.out.println(sameEnds(new int[]{5,6,45,99,13,5,6},3));

    }

    //    Return true if the group of N numbers at the start and end of the array are the same. For example,  with
    //    {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may  assume
    //    that n is in the range 0..nums.length inclusive.
    //
    //    sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    //    sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    //    sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
    private static boolean sameEnds(int[] nums,
                                    int len) {
        List<Integer>numsList = Arrays.stream(nums).boxed().toList();
        List<Integer>head = numsList.subList(0,len);
        List<Integer>tail = numsList.subList(numsList.size()-len, numsList.size());

        return head.equals(tail);
            }
}
