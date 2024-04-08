package warmup1.in3050;

public class Main {

    public static void main(String[] args) {

        System.out.println(in3050(30,31));
        System.out.println(in3050(30,41));
        System.out.println(in3050(40,50));

    }

//    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
//
//    in3050(30, 31) → true
//    in3050(30, 41) → false
//    in3050(40, 50) → true
    private static boolean in3050(int a, int b){

        boolean aIn3040 = a>=30 && a <=40;
        boolean aIn4050 = a>=40 && a <=50;
        boolean bIn3040 = b>=30 && b<=40;
        boolean bIn4050 = b>=40 && b<=50;

        return aIn3040 && bIn3040 || aIn4050 && bIn4050;
    }
}
