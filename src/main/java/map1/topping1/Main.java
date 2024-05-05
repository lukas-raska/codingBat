package map1.topping1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(topping1(new HashMap<>(Map.of("ice cream", "peanuts"))));
        System.out.println(topping1(new HashMap<>(Map.of())));
        System.out.println(topping1(new HashMap<>(Map.of("pancake", "syrup"))));
    }

    //    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream"
    //    is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
    //
    //    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    //    topping1({}) → {"bread": "butter"}
    //    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
    private static Map<String, String> topping1(Map<String, String> map) {
        map.computeIfPresent("ice cream", (k,v)-> v = "cherry");
        map.put("bread", "butter");

        return map;
    }
}
