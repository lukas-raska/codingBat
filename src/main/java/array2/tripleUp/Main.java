package array2.tripleUp;

public class Main {

    public static void main(String[] args) {

        System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2}));
        System.out.println(tripleUp(new int[]{1, 2, 3}));
        System.out.println(tripleUp(new int[]{1, 2, 4}));

    }

    //    Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ...  or
    //    23, 24, 25.
    //
    //    tripleUp([1, 4, 5, 6, 2]) → true
    //    tripleUp([1, 2, 3]) → true
    //    tripleUp([1, 2, 4]) → false
    private static boolean tripleUp(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            int current = nums[i];
            int next = nums[i + 1];
            int overTheNext = nums[i + 2];
            if (next == current + 1 && overTheNext == next + 1) {
                return true;
            }
        }
        return false;
    }
}
