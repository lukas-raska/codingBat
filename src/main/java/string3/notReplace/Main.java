package string3.notReplace;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));

    }

    //    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with
    //    "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the
    //    "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
    //
    //    notReplace("is test") → "is not test"
    //    notReplace("is-is") → "is not-is not"
    //    notReplace("This is right") → "This is not right"
    private static String notReplace(String str) {
            return str.replaceAll("\\bis\\b", "is not");
        }

    }

