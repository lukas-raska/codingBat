package logic1.shareDigit;

public class Main {

    public static void main(String[] args) {

        System.out.println(shareDigit(12,23));
        System.out.println(shareDigit(12,43));
        System.out.println(shareDigit(12,44));

    }

    //    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
    //    such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives
    //    the right digit.)
    //
    //    shareDigit(12, 23) → true
    //    shareDigit(12, 43) → false
    //    shareDigit(12, 44) → false
    private static boolean shareDigit(int a,
                                      int b) {
        int lastDigitA = a % 10;
        int firstDigitA = (a / 10) % 10;
        int lastDigitB = b % 10;
        int firstDigitB = (b / 10) % 10;

        return lastDigitA == lastDigitB || lastDigitA == firstDigitB || firstDigitA == lastDigitB || firstDigitA == firstDigitB;
    }
}
