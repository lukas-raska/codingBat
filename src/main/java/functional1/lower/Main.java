package functional1.lower;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(lower(new ArrayList<>(List.of("Hello", "Hi"))));
        System.out.println(lower(new ArrayList<>(List.of("AAA", "BBB", "ccc"))));
        System.out.println(lower(new ArrayList<>(List.of("KitteN", "ChocolaTE"))));
    }

    //    Given a list of strings, return a list where each string is converted to lower case (Note: String
    //    toLowerCase() method).
    //
    //    lower(["Hello", "Hi"]) → ["hello", "hi"]
    //    lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    //    lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
    private static List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }
}
