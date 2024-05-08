package AP1.scoresIncreasing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(scoresIncreasing(new int[]{1,3,4}));
        System.out.println(scoresIncreasing(new int[]{1,3,2}));
        System.out.println(scoresIncreasing(new int[]{1,1,4}));
    }

    //    Given an array of scores, return true if each score is equal or greater than the one before. The array will
    //    be length 2 or more.
    //
    //    scoresIncreasing([1, 3, 4]) → true
    //    scoresIncreasing([1, 3, 2]) → false
    //    scoresIncreasing([1, 1, 4]) → true
    private static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]<scores[i-1]){
                return false;
            }
        }
        return true;
    }
}
