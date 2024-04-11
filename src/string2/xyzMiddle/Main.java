package string2.xyzMiddle;

public class Main {

    public static void main(String[] args) {

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    //    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number
    //    of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
    //
    //    xyzMiddle("AAxyzBB") → true
    //    xyzMiddle("AxyzBB") → true
    //    xyzMiddle("AxyzBBB") → false
    private static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int middleIndex = str.length() / 2;
        int minXYZIndex = middleIndex - ((str.length() % 2 == 0) ? 2 : 1);
        int maxXYZIndex = middleIndex + 2;
        return str.substring(minXYZIndex, maxXYZIndex).contains("xyz");
    }
}
