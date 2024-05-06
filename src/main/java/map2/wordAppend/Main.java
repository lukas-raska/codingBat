package map2.wordAppend;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "b", "a", "a"}));

    }

    //    Loop over the given array of strings to build a result string like this: when a string appears the 2nd,
    //    4th,  6th, etc. time in the array, append the string to the result. Return the empty string if no string
    //    appears a 2nd time.
    //
    //    wordAppend(["a", "b", "a"]) → "a"
    //    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    //    wordAppend(["a", "", "a"]) → "a"
    private static String wordAppend(String[] strings) {

        Map<String, Integer> countingMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            if (!countingMap.containsKey(s)) {
                countingMap.put(s, 1);
            } else {
                result.append(s);
                countingMap.remove(s);
            }
        }
        return result.toString();
    }
}
