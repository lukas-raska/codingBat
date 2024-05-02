package warmup2.stringTimes;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringTimes("Hi",2));
        System.out.println(stringTimes("Hi",3));
        System.out.println(stringTimes("Hi",1));

    }

    //    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    //
    //    stringTimes("Hi", 2) → "HiHi"
    //    stringTimes("Hi", 3) → "HiHiHi"
    //    stringTimes("Hi", 1) → "Hi"
    private static String stringTimes(String str,
                                      int n) {

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(str);
        }
        return output.toString();
    }
}
