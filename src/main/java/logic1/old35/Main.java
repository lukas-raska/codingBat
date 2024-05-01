package logic1.old35;

public class Main {

    public static void main(String[] args) {

        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));

    }

    //    Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod"
    //    operator -- see Introduction to Mod
    //
    //    old35(3) → true
    //    old35(10) → true
    //    old35(15) → false
    private static boolean old35(int n) {

        boolean multipleOf3 = n % 3 == 0;
        boolean multipleOf5 = n % 5 == 0;

        return (multipleOf3 && !multipleOf5) || (!multipleOf3 && multipleOf5);
    }

}
