package string2.plusOut;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    //    Given a string and a non-empty word string, return a version of the original String where all chars have
    //    been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
    //
    //    plusOut("12xy34", "xy") → "++xy++"
    //    plusOut("12xy34", "1") → "1+++++"
    //    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    private static String plusOut(String str,
                                  String word) {
        StringBuilder result = new StringBuilder(str);
        int index = 0;
        while (result.indexOf(word, index) >= 0) {
            int wordIndex = result.indexOf(word, index);
            StringBuilder replacement = new StringBuilder();
            for (int i = 0; i < wordIndex - index; i++) {
                replacement.append("+");
            }
            result.replace(index, wordIndex, replacement.toString());
            index = wordIndex + word.length();
        }
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i < result.length() - index; i++) {
            replacement.append("+");
        }
        result.replace(index, result.length(), replacement.toString());

        return result.toString();
    }


}

