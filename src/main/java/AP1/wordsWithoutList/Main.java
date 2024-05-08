package AP1.wordsWithoutList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"},1));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"},3));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"},4));
    }

    //    Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length
    //    are omitted. See wordsWithout() below which is more difficult because it uses arrays.
    //
    //    wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
    //    wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
    //    wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
    private static List<String> wordsWithoutList(String[] words,
                                                 int len) {
        return Arrays.stream(words)
                .filter(word -> word.length() != len)
                .collect(Collectors.toList());
    }
}
