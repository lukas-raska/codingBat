package AP1.wordsCount;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }

    //    Given an array of strings, return the count of the number of strings with the given length.
    //
    //    wordsCount(["a", "bb", "b", "ccc"], 1) → 2
    //    wordsCount(["a", "bb", "b", "ccc"], 3) → 1
    //    wordsCount(["a", "bb", "b", "ccc"], 4) → 0
    private static int wordsCount(String[] words,
                                  int len) {
        return (int) Arrays.stream(words)
                .filter(word -> word.length() == len)
                .count();
    }
}
