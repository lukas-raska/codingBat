package functional1.addStar;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(addStar(new ArrayList<>(List.of("a","bb","ccc"))));
        System.out.println(addStar(new ArrayList<>(List.of("hello", "there"))));
        System.out.println(addStar(new ArrayList<>(List.of("*"))));
    }

    //    Given a list of strings, return a list where each string has "*" added at its end.
    //
    //    addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    //    addStar(["hello", "there"]) → ["hello*", "there*"]
    //    addStar(["*"]) → ["**"]
    private static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }
}
