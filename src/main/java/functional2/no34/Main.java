package functional2.no34;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(no34(List.of("a", "bb", "ccc")));
        System.out.println(no34(List.of("a", "bb", "ccc", "dddd")));
        System.out.println(no34(List.of("ccc", "dddd", "apple")));
    }

    //    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
    //
    //    no34(["a", "bb", "ccc"]) → ["a", "bb"]
    //    no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
    //    no34(["ccc", "dddd", "apple"]) → ["apple"]
    private static List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }
}
