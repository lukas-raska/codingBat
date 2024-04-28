package array1.double23;

public class Main {

    public static void main(String[] args) {

        System.out.println(double23(new int[]{2,2}));
        System.out.println(double23(new int[]{3,3}));
        System.out.println(double23(new int[]{2,3}));

    }

    //    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    //
    //    double23([2, 2]) → true
    //    double23([3, 3]) → true
    //    double23([2, 3]) → false
    private static boolean double23(int[] nums) {
        int countOf2 = 0;
        int countOf3 = 0;
        for (int num : nums) {
            if (num == 2) {
                countOf2++;
            }
            if (num == 3) {
                countOf3++;
            }
        }
        return countOf2 == 2 || countOf3 == 2;
    }

}
