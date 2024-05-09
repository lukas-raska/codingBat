package recursion1.array11;

public class Main {

    public static void main(String[] args) {

        System.out.println(array11(new int[]{1,2,11}, 0));
        System.out.println(array11(new int[]{11,11}, 0));
        System.out.println(array11(new int[]{1,2,3,4}, 0));
    }

    //    Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
    //    We'll use the convention of considering only the part of the array that begins at the given index. In this
    //    way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    //
    //    array11([1, 2, 11], 0) → 1
    //    array11([11, 11], 0) → 2
    //    array11([1, 2, 3, 4], 0) → 0
    private static int array11(int[] nums,
                               int index) {
        if (nums.length == 0) {
            return 0;
        }
        if (index < 0 || index >= nums.length) {
            return 0;
        }
        int count = (nums[index] == 11) ? 1 : 0;
        return count + array11(nums, index + 1);

    }
}
