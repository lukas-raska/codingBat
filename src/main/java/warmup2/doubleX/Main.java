package warmup2.doubleX;

public class Main {

    public static void main(String[] args) {

        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));

    }

    //    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    //
    //    doubleX("axxbb") → true
    //    doubleX("axaxax") → false
    //    doubleX("xxxxx") → true
    private static boolean doubleX(String str) {

        return str.contains("x") && str.indexOf("x") == str.indexOf("xx");
    }
}
