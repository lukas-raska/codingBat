package logic1.withoutDoubles;

public class Main {

    public static void main(String[] args) {

        System.out.println(withoutDoubles(2,3,true));
        System.out.println(withoutDoubles(3,3,true));
        System.out.println(withoutDoubles(3,3,false));

    }

    //    Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two
    //    dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
    //
    //    withoutDoubles(2, 3, true) → 5
    //    withoutDoubles(3, 3, true) → 7
    //    withoutDoubles(3, 3, false) → 6
    private static int withoutDoubles(int dice1,
                                      int dice2,
                                      boolean noDoubles) {
        if (noDoubles && (dice1 == dice2)) {
            dice1 = (dice1 == 6) ? 1 : dice1 + 1;
        }
        return dice1 + dice2;
    }
}
