package warmup2.stringYak;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));

    }

    //    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but
    //    the "a" can be any char. The "yak" strings will not overlap.
    //
    //    stringYak("yakpak") → "pak"
    //    stringYak("pakyak") → "pak"
    //    stringYak("yak123ya") → "123ya"
    private static String stringYak(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < str.length() - 2) {
            if (str.charAt(index) == 'y' && str.charAt(index + 2) == 'k') {
                index += 3;
            } else {
                result.append(str.charAt(index));
                index++;
            }
        }
        result.append(str.substring(index));
        return result.toString();
    }
}

