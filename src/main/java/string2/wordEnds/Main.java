package string2.wordEnds;

public class Main {

    public static void main(String[] args) {

        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    //    Given a string and a non-empty word string, return a string made of each char just before and just after
    //    every   appearance of the word in the string. Ignore cases where there is no char before or after the word,
    //    and a char may be included twice if it is between two words.
    //
    //    wordEnds("abcXY123XYijk", "XY") → "c13i"
    //    wordEnds("XY123XY", "XY") → "13"
    //    wordEnds("XY1XY", "XY") → "11"
    private static String wordEnds(String str,
                                   String word) {
        StringBuilder result = new StringBuilder();
        int currentIndex = 0;
        while (str.indexOf(word, currentIndex) >= 0) {
            int indexOfWord = str.indexOf(word, currentIndex);
            if (indexOfWord - 1 >= 0) {
                result.append(str.charAt(indexOfWord - 1));
            }
            if (indexOfWord + word.length() < str.length()) {
                result.append(str.charAt(indexOfWord + word.length()));
            }
            currentIndex = indexOfWord + word.length();
        }
        return result.toString();
    }

}
