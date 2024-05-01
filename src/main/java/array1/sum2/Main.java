package array1.sum2;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum2(new int[]{1,2,3}));
        System.out.println(sum2(new int[]{1,1}));
        System.out.println(sum2(new int[]{1,1,1,1}));

    }

    //    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less
    //    than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    //
    //    sum2([1, 2, 3]) → 3
    //    sum2([1, 1]) → 2
    //    sum2([1, 1, 1, 1]) → 2
    private static int sum2(int[] nums) {
        int sum = 0;
        int limitLength = Math.min(nums.length, 2);
        for (int i = 0; i < limitLength; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
