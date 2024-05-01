package array1.unlucky1;

public class Main {

    public static void main(String[] args) {

        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{1, 1, 1}));
    }

    //    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given
    //    array  contains an unlucky 1 in the first 2 or last 2 positions in the array.
    //
    //    unlucky1([1, 3, 4, 5]) → true
    //    unlucky1([2, 1, 3, 4, 5]) → true
    //    unlucky1([1, 1, 1]) → false
    private static boolean unlucky1(int[] nums) {

        if (nums.length < 2) {
            return false;
        }

        //check front
        int limit = (nums.length < 3) ? 1 : 2;
        for (int i = 0; i < limit; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;
            }
        }
        //check end
        for (int i = nums.length - 2; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;
            }
        }
        //if found nothing
        return false;
    }
}
