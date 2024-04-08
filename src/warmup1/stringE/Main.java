package warmup1.stringE;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));

    }

    //    Return true if the given string contains between 1 and 3 'e' chars.
    //
    //    stringE("Hello") → true
    //    stringE("Heelle") → true
    //    stringE("Heelele") → false
    private static boolean stringE(String str) {
        int eCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'e') {
                eCount++;
            }
        }
        return eCount > 0 && eCount <= 3;
    }
}
