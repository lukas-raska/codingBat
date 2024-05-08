package AP1.wordsWithout;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "a")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "b")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "c")));
    }

    //    Given an array of strings, return a new array without the strings that are equal to the target string.  One
    //    approach is to count the occurrences of the target string, make a new array of the correct length, and
    //    then copy over the correct strings.
    //
    //    wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    //    wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    //    wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
    private static String[] wordsWithout(String[] words,
                                         String target) {
        return Arrays.stream(words)
                .filter(word -> !word.equals(target))
                .toArray(String[]::new);
    }
}
