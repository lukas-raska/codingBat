package recursion1.countPairs;

public class Main {

    public static void main(String[] args) {

        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));

    }

    //    We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a
    //    pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the
    //    number  of pairs in the given string.
    //
    //    countPairs("axa") → 1
    //    countPairs("axax") → 2
    //    countPairs("axbx") → 1
    private static int countPairs(String str) {

        if (str.length()<3){
            return 0;
        }
        int pairsCount = 0;

        if (str.charAt(0) == str.charAt(2)){
            pairsCount++;
        }
        return pairsCount + countPairs(str.substring(1));


    }
}
