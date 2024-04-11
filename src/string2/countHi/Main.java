package string2.countHi;

public class Main {

    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }

    //    Return the number of times that the string "hi" appears anywhere in the given string.
    //
    //    countHi("abc hi ho") → 1
    //    countHi("ABChi hi") → 2
    //    countHi("hihi") → 2
    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String tested = str.substring(i, i + 2);
            if (tested.equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
