package map2.wordCount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(wordCount(new String[]{"a","b","a","c","b"}));
        System.out.println(wordCount(new String[]{"c","b","a"}));
        System.out.println(wordCount(new String[]{"c","c","c","c"}));
    }

    //    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for
    //    each different string, with the value the number of times that string appears in the array.
    //
    //    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    //    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    //    wordCount(["c", "c", "c", "c"]) → {"c": 4}
    private static Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> result = new HashMap<>();

        for (String s : strings) {
            Integer value = (result.containsKey(s)) ? result.get(s) + 1 : 1;
            result.put(s, value);
        }

        return result;
    }
}
