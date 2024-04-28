package array1.has23;

public class Main {

    public static void main(String[] args) {

        System.out.println(has23(new int[]{2,5}));
        System.out.println(has23(new int[]{4,3}));
        System.out.println(has23(new int[]{4,5}));
    }

    //    Given an int array length 2, return true if it contains a 2 or a 3.
    //
    //    has23([2, 5]) → true
    //    has23([4, 3]) → true
    //    has23([4, 5]) → false
    private static boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }
}
