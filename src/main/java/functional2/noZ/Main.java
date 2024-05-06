package functional2.noZ;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(noZ(List.of("aaa", "bbb", "aza")));
        System.out.println(noZ(List.of("hziz", "hzello", "hi")));
        System.out.println(noZ(List.of("hello", "howz", "are", "youz")));
    }

    //    Given a list of strings, return a list of the strings, omitting any string that contains a "z".  (Note: the
    //    str.contains(x) method returns a boolean)
    //
    //    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    //    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    //    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
    private static List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }
}
