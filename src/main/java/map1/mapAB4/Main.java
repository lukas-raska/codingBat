package map1.mapAB4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))));
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))));


    }

    //    Modify and return the given map as follows: if the keys "a" and "b" have values that have different
    //    lengths, then set "c" to have the longer value. If the values exist and have the same length, change them
    //    both to the empty string in the map.
    //
    //    mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
    //    mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
    //    mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}


    //    private static Map<String, String> mapAB4(Map<String, String> map) {
    //
    //        map.entrySet().stream()
    //                .filter(entry -> entry.getKey().equals("a") || entry.getKey().equals("b"))
    //                .map(Map.Entry::getValue)
    //                .max(Comparator.comparing(String::length))
    //                .ifPresentOrElse(
    //                        s -> map.put("c", s),
    //                        () -> {
    //                            map.put("a", "");
    //                            map.put("b", "");
    //                        });
    //
    //        return map;
    //    }

    private static Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {

            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            } else {
                map.entrySet().stream()
                        .filter(entry -> entry.getKey().equals("a") || entry.getKey().equals("b"))
                        .map(Map.Entry::getValue)
                        .max(Comparator.comparing(String::length))
                        .ifPresent(s -> map.put("c", s));
            }
        }
        return map;


    }
}

