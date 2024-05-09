package recursion1.count8;

public class Main {

    public static void main(String[] args) {

        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
    }

    //    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
    //    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%)
    //    by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 /
    //    10 is 12).
    //
    //    count8(8) → 1
    //    count8(818) → 2
    //    count8(8818) → 4
    private static int count8(int n) {
        if (n < 10) {
            return (n == 8) ? 1 : 0;
        }
        int current = (n % 10 == 8) ? 1 : 0;

        if (current == 1 && (n / 10) % 10 == 8) {
            current *= 2;
        }

        return current + count8(n / 10);
    }
}
