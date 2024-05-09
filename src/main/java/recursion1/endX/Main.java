package recursion1.endX;

import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {

        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }

    //    Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the
    //    end of the string.
    //
    //    endX("xxre") → "rexx"
    //    endX("xxhixx") → "hixxxx"
    //    endX("xhixhix") → "hihixxx"
    private static String endX(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char firstChar = str.charAt(0);
        String rest = endX(str.substring(1));

        if (firstChar == 'x') {
            return rest + firstChar;
        }
        return firstChar + rest;


    }

    //    private static String endX(String str) {
    //
    //        StringBuilder front = new StringBuilder();
    //        StringBuilder end = new StringBuilder();
    //
    //        for (char c : str.toCharArray()) {
    //            if (c == 'x'){
    //                end.append(c);
    //            } else {
    //                front.append(c);
    //            }
    //        }
    //        return front.append(end).toString();
    //    }
}
