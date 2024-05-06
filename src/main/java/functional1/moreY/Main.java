package functional1.moreY;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(moreY(new ArrayList<>(List.of("a", "b", "c"))));
        System.out.println(moreY(new ArrayList<>(List.of("hello", "there"))));
        System.out.println(moreY(new ArrayList<>(List.of("yay"))));
    }

    //    Given a list of strings, return a list where each string has "y" added at its start and end.
    //
    //    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    //    moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    //    moreY(["yay"]) → ["yyayy"]
    private static List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}
