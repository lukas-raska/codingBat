package string2.bobThere;

public class Main {

    public static void main(String[] args) {

        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
    }

    //    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    //
    //    bobThere("abcbob") → true
    //    bobThere("b9b") → true
    //    bobThere("bac") → false
    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            String tested = str.substring(i, i + 3);
            if (tested.startsWith("b") && tested.endsWith("b")) {
                return true;
            }
        }
        return false;
    }
}
