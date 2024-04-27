package logic1.lastDigit;

public class Main {
    public static void main(String[] args) {

        System.out.println(lastDigit(23,19,13));
        System.out.println(lastDigit(23,19,12));
        System.out.println(lastDigit(23,19,3));

    }

    //    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are
    //    non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    //
    //    lastDigit(23, 19, 13) → true
    //    lastDigit(23, 19, 12) → false
    //    lastDigit(23, 19, 3) → true
    private static boolean lastDigit(int a,
                             int b,
                             int c) {

        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
}


