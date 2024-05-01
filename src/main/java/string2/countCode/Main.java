package string2.countCode;

public class Main {

    public static void main(String[] args) {

        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("codexxcode"));
    }

    //    Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    //
    //    countCode("aaacodebbb") → 1
    //    countCode("codexxcode") → 2
    //    countCode("codexxcode") → 2
    private static int countCode(String str) {
        int count = 0;
        if (str.length() > 3) {
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                    count++;
                }
            }
        }
        return count;
    }
}
