package string3.equalsIsNot;

public class Main {

    public static void main(String[] args) {

        System.out.println(equalsIsNot("This is not"));
        System.out.println(equalsIsNot("This is notnot"));
        System.out.println(equalsIsNot("noisxxnotyynotxisi"));

    }

    //    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the
    //    number of appearances of "not" anywhere in the string (case sensitive).//
    //    equalIsNot("This is not") → false
    //    equalIsNot("This is notnot") → true
    //    equalIsNot("noisxxnotyynotxisi") → true
    private static boolean equalsIsNot(String str) {

        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i <= str.length() - "is".length(); i++) {
            String tested = str.substring(i, i + "is".length());
            if (tested.equals("is")) {
                isCount++;
            }
        }
        for (int i = 0; i <= str.length() - "not".length(); i++) {
            String tested = str.substring(i, i + "not".length());
            if (tested.equals("not")) {
                notCount++;
            }
        }
        return isCount == notCount;
    }
}
