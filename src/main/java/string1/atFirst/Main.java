package string1.atFirst;

public class Main {

    public static void main(String[] args) {

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(""));
    }

    //    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
    //    use '@' for the missing chars.
    //
    //    atFirst("hello") → "he"
    //    atFirst("hi") → "hi"
    //    atFirst("h") → "h@"
    private static String atFirst(String str) {
        return switch (str.length()) {
            case 0 -> "@@";
            case 1 -> str.charAt(0) + "@";
            default -> str.substring(0, 2);
        };
    }
}
