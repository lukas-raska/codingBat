package functional1.noX;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println(noX(new ArrayList<>(List.of("ax", "bb", "cx"))));
        System.out.println(noX(new ArrayList<>(List.of("xxax", "xbxbx", "xxcx"))));
        System.out.println(noX(new ArrayList<>(List.of("x"))));

    }
    //    Given a list of strings, return a list where each string has all its "x" removed.
    //
    //    noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    //    noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    //    noX(["x"]) → [""]

    private static List<String> noX(List<String> strings) {
      return strings.stream()
              .map(s-> s.replaceAll("x",""))
              .collect(Collectors.toList());
    }
}
