package map1.topping2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(topping2(new HashMap<>(Map.of("ice cream", "cherry"))));
        System.out.println(topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))));
        System.out.println(topping2(new HashMap<>(Map.of("yoghurt", "salt"))));
    }

    //    Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice
    //    cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value,
    //    change that value to "nuts".
    //
    //    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
    //    topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream":
    //    "cherry"}
    //    topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
    private static Map<String, String> topping2(Map<String, String> map) {

        if (map.get("ice cream") != null) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.get("spinach")!=null){
            map.put("spinach","nuts");
        }
        return map;
    }
}
