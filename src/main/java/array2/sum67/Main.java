package array2.sum67;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum67(new int[]{1,2,2}));
        System.out.println(sum67(new int[]{1,2,2,6,99,99,7}));
        System.out.println(sum67(new int[]{1,1,6,7,2}));

    }

    //    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
    //    extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    //
    //    sum67([1, 2, 2]) → 5
    //    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    //    sum67([1, 1, 6, 7, 2]) → 4
    private static int sum67(int[] nums) {
        int sum = 0;
        boolean isIgnored = false;
        for (int num : nums) {
            if (num == 6) {
                isIgnored = true;
            }
            if (num == 7 && isIgnored) {
                isIgnored = false;
                continue;
            }
            sum += isIgnored ? 0 : num;
        }
        return sum;
    }
}
