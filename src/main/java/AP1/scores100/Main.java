package AP1.scores100;

public class Main {

    public static void main(String[] args) {

        System.out.println(scores100(new int[]{1,100,100}));
        System.out.println(scores100(new int[]{1,100,99,100}));
        System.out.println(scores100(new int[]{100,1,100,100}));
    }

    //    Given an array of scores, return true if there are scores of 100 next to each other in the array. The array
    //    length will be at least 2.
    //
    //    scores100([1, 100, 100]) → true
    //    scores100([1, 100, 99, 100]) → false
    //    scores100([100, 1, 100, 100]) → true
    private static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i]==100 && scores[i+1] == 100){
                return true;
            }
        }
        return false;
    }
}
