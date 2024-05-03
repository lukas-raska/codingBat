package string3.gHappy;

public class Main {

    public static void main(String[] args) {

        System.out.println(gHappy(""));
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }

    //    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or
    //    right. Return true if all the g's in the given string are happy.
    //
    //    gHappy("xxggxx") → true
    //    gHappy("xxgxx") → false
    //    gHappy("xxggyygxx") → false
    private static boolean gHappy(String str) {

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != 'g') {
                continue;
            }
            char prev = (i - 1 < 0) ? '-' : str.charAt(i - 1);
            char next = (i + 1 > str.length() - 1) ? '-' : str.charAt(i + 1);

            if (prev != 'g' && next != 'g') {
                return false;
            }
        }
        return true;
    }
}
