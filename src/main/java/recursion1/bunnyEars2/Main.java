package recursion1.bunnyEars2;

public class Main {

    public static void main(String[] args) {

        System.out.println(bunnyEars2(0));
        System.out.println(bunnyEars2(1));
        System.out.println(bunnyEars2(2));
    }

    //    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    //    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return
    //    the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    //
    //    bunnyEars2(0) → 0
    //    bunnyEars2(1) → 2
    //    bunnyEars2(2) → 5
    private static int bunnyEars2(int bunnies) {
        int numberOfEars = (bunnies % 2 == 0) ? 3 : 2;
        if (bunnies == 0) {
            return 0;
        }
        return numberOfEars + bunnyEars2(bunnies - 1);
    }
}
