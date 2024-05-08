package AP1.hasOne;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasOne(10));
        System.out.println(hasOne(22));
        System.out.println(hasOne(220));
    }

    //    Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and /
    //    to discard the rightmost digit.
    //
    //    hasOne(10) → true
    //    hasOne(22) → false
    //    hasOne(220) → false
    private static boolean hasOne(int n) {
        int rightDigit = 0;

        while (n!=0){
            rightDigit = n%10;
            if (rightDigit == 1){
                return true;
            }
            n/=10;
        }
        return false;
    }
}
