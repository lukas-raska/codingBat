package array2.either24;

public class Main {

    public static void main(String[] args) {

        System.out.println(either24(new int[]{1,2,2}));
        System.out.println(either24(new int[]{4,4,1}));
        System.out.println(either24(new int[]{4,4,1,2,2}));

    }

    //    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    //
    //    either24([1, 2, 2]) → true
    //    either24([4, 4, 1]) → true
    //    either24([4, 4, 1, 2, 2]) → false
    private static boolean either24(int[] nums) {

        boolean hasTwiceTwo = false;
        boolean hasTwiceFour = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                hasTwiceTwo = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                hasTwiceFour = true;
            }
        }
        return (hasTwiceTwo && !hasTwiceFour) || (!hasTwiceTwo && hasTwiceFour);
    }
}
