package AP1.wordsFront;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(wordsFront(new String[]{"a", "b", "c", "d"},1)));
        System.out.println(Arrays.toString(wordsFront(new String[]{"a", "b", "c", "d"},2)));
        System.out.println(Arrays.toString(wordsFront(new String[]{"a", "b", "c", "d"},3)));

    }

    //    Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
    //
    //    wordsFront(["a", "b", "c", "d"], 1) → ["a"]
    //    wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
    //    wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
    private static String[] wordsFront(String[] words,
                                       int n) {
        return Arrays.copyOf(words, n);
    }
}
