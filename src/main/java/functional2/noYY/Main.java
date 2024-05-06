package functional2.noYY;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(noYY(List.of("a", "b", "c")));
        System.out.println(noYY(List.of("a", "b", "cy")));
        System.out.println(noYY(List.of("xx", "ya", "zz")));
    }

    //    Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting
    //    strings that contain "yy" as a substring anywhere.
    //
    //    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    //    noYY(["a", "b", "cy"]) → ["ay", "by"]
    //    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
    private static List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}
