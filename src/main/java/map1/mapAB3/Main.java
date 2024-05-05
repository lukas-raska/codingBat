package map1.mapAB3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake"))));
        System.out.println(mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake"))));
        System.out.println(mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))));
    }

    private static Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}
