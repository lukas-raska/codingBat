package array2.haveThree;

public class Main {

    public static void main(String[] args) {

        System.out.println(haveThree(new int[]{3,1,3,1,3}));
        System.out.println(haveThree(new int[]{3,1,3,3}));
        System.out.println(haveThree(new int[]{3,4,3,3,4}));

    }

    //    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are
    //    next to each other.
    //
    //    haveThree([3, 1, 3, 1, 3]) → true
    //    haveThree([3, 1, 3, 3]) → false
    //    haveThree([3, 4, 3, 3, 4]) → false
    private static boolean haveThree(int[] nums) {

        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int tested = nums[i];
            int next = ((i + 1) < nums.length) ? nums[i + 1] : 0;
            if (tested == 3) {
                threeCount++;
            }
            if (tested == 3 && next == 3) {
                threeCount = 0;
            }
        }
        return threeCount == 3;
    }

}
