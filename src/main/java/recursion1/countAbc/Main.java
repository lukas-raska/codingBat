package recursion1.countAbc;

public class Main {

    public static void main(String[] args) {

        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));

    }

    //    Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
    //
    //    countAbc("abc") → 1
    //    countAbc("abcxxabc") → 2
    //    countAbc("abaxxaba") → 2
    private static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        if (str.startsWith("abc") || str.startsWith("aba")) {
            count++;
        }
        return count + countAbc(str.substring(1));
    }
}
