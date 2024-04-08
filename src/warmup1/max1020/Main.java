package warmup1.max1020;

public class Main {

    public static void main(String[] args) {

        System.out.println(max1020(11,19));
        System.out.println(max1020(19,11));
        System.out.println(max1020(11,9));

    }

//    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if
//    neither  is in that range.
//
//    max1020(11, 19) → 19
//    max1020(19, 11) → 19
//    max1020(11, 9) → 11
    private static int max1020(int a,
                               int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            return Math.max(a, b);
        } else if (b >= 10 && b <= 20) {
            return b;
        } else if (a >= 10 && a <= 20) {
            return a;
        }
        return 0;
    }
}
