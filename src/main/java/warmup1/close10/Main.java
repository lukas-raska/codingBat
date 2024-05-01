package warmup1.close10;

public class Main {

    public static void main(String[] args) {

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));

    }

    //    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    //
    //    close10(8, 13) → 8
    //    close10(13, 8) → 8
    //    close10(13, 7) → 0
    private static int close10(int a,
                               int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff) {
            return a;
        }
        if (aDiff > bDiff) {
            return b;
        }
        return 0;
    }
}
