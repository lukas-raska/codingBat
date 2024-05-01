package warmup1.notString;

public class Main {

    public static void main(String[] args) {

        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }

    //    Given a string, return a new string where "not " has been added to the front. However, if the string
    //    already  begins  with  "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    //
    //    notString("candy") → "not candy"
    //    notString("x") → "not x"
    //    notString("not bad") → "not bad"
    private static String notString(String str) {
        return str.startsWith("not")? str : ("not " + str);
    }


}
