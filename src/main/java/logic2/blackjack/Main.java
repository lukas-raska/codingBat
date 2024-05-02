package logic2.blackjack;

public class Main {

    public static void main(String[] args) {

        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19,22));

    }

    //    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if
    //    they both go over.
    //
    //    blackjack(19, 21) → 21
    //    blackjack(21, 19) → 21
    //    blackjack(19, 22) → 19
    private static int blackjack(int a,
                                 int b) {

        int diffA = 21 - a;
        int diffB = 21 - b;

        if (diffA >= 0 && diffB >= 0) {
            return Math.max(a, b);
        } else if (diffA >= 0) {
            return a;
        } else if (diffB >= 0) {
            return b;
        }
        return 0;
    }

}
