package string1.middleThree;

public class Main {

    public static void main(String[] args) {

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

    }

    //    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The
    //    string length will be at least 3.
    //
    //    middleThree("Candy") → "and"
    //    middleThree("and") → "and"
    //    middleThree("solving") → "lvi"
    private static String middleThree(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 2);
    }
}

