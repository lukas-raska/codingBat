package warmup1.mixStart;

public class Main {

    public static void main(String[] args) {

        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));

    }

//    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//    mixStart("mix snacks") → true
//    mixStart("pix snacks") → true
//    mixStart("piz snacks") → false
    private static boolean mixStart(String str){
        return str.startsWith("ix",1);
    }
}
