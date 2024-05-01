package array1.start1;

public class Main {

    public static void main(String[] args) {

        System.out.println(start1(new int[]{1,2,3}, new int[]{1,3}));
        System.out.println(start1(new int[]{7,2,3}, new int[]{1}));
        System.out.println(start1(new int[]{1,2}, new int[]{}));
    }

    //    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    //
    //    start1([1, 2, 3], [1, 3]) → 2
    //    start1([7, 2, 3], [1]) → 1
    //    start1([1, 2], []) → 1
    private static int start1(int[] a,
                              int[] b) {

        int firstA = (a.length == 0) ? 0 : a[0];
        int firstB = (b.length == 0) ? 0 : b[0];
        if (firstA == 1 && firstB == 1) {
            return 2;
        } else if (firstA != 1 && firstB != 1) {
            return 0;
        }
        return 1;
    }
}
