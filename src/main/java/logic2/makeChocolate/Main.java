package logic2.makeChocolate;

public class Main {

    public static void main(String[] args) {

        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));

    }

    //    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars  (5 kilos
    //    each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1
    //    if it can't be done.
    //
    //    makeChocolate(4, 1, 9) → 4
    //    makeChocolate(4, 1, 10) → -1
    //    makeChocolate(4, 1, 7) → 2
    private static int makeChocolate(int small,
                                     int big,
                                     int goal) {
        int bigSize = 5;
        int smallSize = 1;

        int usableBig = goal / bigSize;
        int smallNeeded = goal - Math.min(usableBig, big) * 5;

        if (smallNeeded > small) {
            return -1;
        }
        return smallNeeded;
    }
}
