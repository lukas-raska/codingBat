package functional2.noLong;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(noLong(List.of("this", "not", "too", "long")));
        System.out.println(noLong(List.of("a", "bbb", "cccc")));
        System.out.println(noLong(List.of("cccc", "cccc", "cccc")));
    }

    //    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
    //
    //    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    //    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    //    noLong(["cccc", "cccc", "cccc"]) → []
    private static List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }
}
