package warmup1.startOz;

public class Main {

    public static void main(String[] args) {

        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));

    }

    //    Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
    //
    //    startOz("ozymandias") → "oz"
    //    startOz("bzoo") → "z"
    //    startOz("oxx") → "o"
    private static String startOz(String str) {
        String first = (!str.isEmpty() && str.charAt(0) == 'o') ? "o" : "";
        String second = (str.length() > 1 && str.charAt(1) == 'z') ? "z" : "";
        return first + second;
    }
}
