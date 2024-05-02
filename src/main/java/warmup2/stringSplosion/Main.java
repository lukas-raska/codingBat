package warmup2.stringSplosion;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

    }

    //    Given a non-empty string like "Code" return a string like "CCoCodCode".
    //
    //    stringSplosion("Code") → "CCoCodCode"
    //    stringSplosion("abc") → "aababc"
    //    stringSplosion("ab") → "aab"
    private static String stringSplosion(String str) {

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            output.append(str, 0, i + 1);
        }
        return output.toString();
    }
}
