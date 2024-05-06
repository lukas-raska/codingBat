package functional1.copies3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(copies3(new ArrayList<>(List.of("a","bb","ccc"))));
        System.out.println(copies3(new ArrayList<>(List.of("24", "a", ""))));
        System.out.println(copies3(new ArrayList<>(List.of("hello", "there"))));
    }

    //    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated
    //    together.
    //
    //    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    //    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    //    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
    private static List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}
