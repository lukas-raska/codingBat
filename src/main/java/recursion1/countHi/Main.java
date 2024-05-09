package recursion1.countHi;

public class Main {

    public static void main(String[] args) {

        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }

    //    Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    //
    //    countHi("xxhixx") → 1
    //    countHi("xhixhix") → 2
    //    countHi("hi") → 1
    private static int countHi(String str) {

        if (str.length()<2){
            return 0;
        }
        return ((str.startsWith("hi"))? 1:0) + countHi(str.substring(1));
    }
}
