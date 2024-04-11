package string2.catDog;

public class Main {

    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }

    //    Return true if the string "cat" and "dog" appear the same number of times in the given string.
    //
    //    catDog("catdog") → true
    //    catDog("catcat") → false
    //    catDog("1cat1cadodog") → true
    private static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String tested = str.substring(i, i + 3);
            if (tested.equals("cat")) {
                catCount++;
            }
            if (tested.equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
}
