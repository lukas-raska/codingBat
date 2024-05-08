package AP1.dividesSelf;

public class Main {

    public static void main(String[] args) {

        System.out.println(dividesSelf(128));
        System.out.println(dividesSelf(12));
        System.out.println(dividesSelf(120));

    }

    //    We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
    //    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
    //    divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost
    //    digit, and / to discard the rightmost digit.
    //
    //    dividesSelf(128) → true
    //    dividesSelf(12) → true
    //    dividesSelf(120) → false
    private static boolean dividesSelf(int n) {

        int processedN = n;
        int rightDigit;

        while (processedN != 0) {
            rightDigit = processedN % 10;
            if (rightDigit == 0 || n % rightDigit != 0) {
                return false;
            }
            processedN /= 10;
        }

        return true;
    }
}
