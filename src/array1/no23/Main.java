package array1.no23;

public class Main {

    public static void main(String[] args) {

        System.out.println(no23(new int[]{4, 5}));
        System.out.println(no23(new int[]{4, 2}));
        System.out.println(no23(new int[]{3, 5}));
    }

    //    Given an int array length 2, return true if it does not contain a 2 or 3.
    //
    //    no23([4, 5]) → true
    //    no23([4, 2]) → false
    //    no23([3, 5]) → false
    private static boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

}
