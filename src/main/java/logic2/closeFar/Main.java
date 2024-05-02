package logic2.closeFar;

public class Main {

    public static void main(String[] args) {

        System.out.println(closeFar(1,2,10));
        System.out.println(closeFar(1,2,3));
        System.out.println(closeFar(4,1, 3));
    }

    //    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the
    //    other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute
    //    value of a number.
    //
    //    closeFar(1, 2, 10) → true
    //    closeFar(1, 2, 3) → false
    //    closeFar(4, 1, 3) → true
    private static boolean closeFar(int a, int b, int c){

        boolean bIsClose = Math.abs(a-b)<=1;
        boolean cIsClose = Math.abs(a-c)<=1;
        boolean bIsFar = Math.abs(a-b)>=2 && Math.abs(c-b)>=2;
        boolean cIsFar = Math.abs(a-c)>=2 && Math.abs(c-b)>=2;

        return (bIsClose && cIsFar) || (bIsFar && cIsClose);
    }
}
