package warmup2.stringX;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    //    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or
    //    end should not be removed.
    //
    //    stringX("xxHxix") → "xHix"
    //    stringX("abxxxcd") → "abcd"
    //    stringX("xabxxxcdx") → "xabcdx"
    private static String stringX(String str) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String toAppend;
            if (i == 0 || i == str.length() - 1) {
                toAppend = "" + str.charAt(i);
            } else {
                toAppend = (str.charAt(i) == 'x') ? "" : ("" + str.charAt(i));
            }
            output.append(toAppend);
        }
        return output.toString();
    }


}
