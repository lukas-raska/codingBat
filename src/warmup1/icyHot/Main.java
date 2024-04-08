package warmup1.icyHot;

public class Main {

    public static void main(String[] args) {

        System.out.println(icyHot(120,-1));
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(2,120));

    }

    //    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    //
    //    icyHot(120, -1) → true
    //    icyHot(-1, 120) → true
    //    icyHot(2, 120) → false
    private static boolean icyHot(int temp1,
                                  int temp2) {
        return temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100;
    }
}
