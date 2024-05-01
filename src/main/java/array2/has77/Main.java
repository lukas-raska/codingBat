package array2.has77;

public class Main {

    public static void main(String[] args) {

        System.out.println(has77(new int[]{1, 7, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 1, 7}));

    }

    //    Given an array of ints, return true if the array contains two 7's next to each other, or there are  two 7's
    //    separated by one element, such as with {7, 1, 7}.
    //
    //    has77([1, 7, 7]) → true
    //    has77([1, 7, 1, 7]) → true
    //    has77([1, 7, 1, 1, 7]) → false
    private static boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int tested = nums[i];
            int next = nums[i + 1];
            int overTheNext = ((i + 2) < nums.length) ? nums[i + 2] : 0;
            if (tested == 7 && (next == 7 || overTheNext == 7)) {
                return true;
            }
        }
        return false;
    }
}
