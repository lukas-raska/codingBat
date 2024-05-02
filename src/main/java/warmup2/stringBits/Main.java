package warmup2.stringBits;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    //    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    //
    //    stringBits("Hello") → "Hlo"
    //    stringBits("Hi") → "H"
    //    stringBits("Heeololeo") → "Hello"
    private static String stringBits(String str) {

        StringBuilder output = new StringBuilder(str.length() / 2);
        for (int i = 0; i < str.length(); i = i + 2) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
