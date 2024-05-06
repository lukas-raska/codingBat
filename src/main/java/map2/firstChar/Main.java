package map2.firstChar;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(firstChar(new String[]{"salt","tea","soda","toast"}));
        System.out.println(firstChar(new String[]{"aa","bb","cc","aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{}));

    }

    //    Given an array of non-empty strings, return a Map<String, String> with a key for every different first
    //    character seen, with the value of all the strings starting with that character appended together in the
    //    order they appear in the array.
    //
    //    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    //    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    //    firstChar([]) → {}
    private static Map<String, String> firstChar(String[] strings) {

        Map<String, String> result = new HashMap<>();

        for (String s: strings){
            result.merge(""+s.charAt(0), s, String::concat);
        }

        return result;
    }
}
