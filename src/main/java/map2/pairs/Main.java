package map2.pairs;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(pairs(new String[]{"code","bug"}));
        System.out.println(pairs(new String[]{"man","moon","main"}));
        System.out.println(pairs(new String[]{"man","moon", "good","night"}));


    }

    //    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string
    //    add its first character as a key with its last character as the value.
    //
    //    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    //    pairs(["man", "moon", "main"]) → {"m": "n"}
    //    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
    private static Map<String, String> pairs(String[] strings) {

        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String key = "" + s.charAt(0);
            String value = "" + s.charAt(s.length()-1);
            result.put(key,value);
        }

        return result;
    }
}
