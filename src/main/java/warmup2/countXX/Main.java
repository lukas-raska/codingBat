package warmup2.countXX;

public class Main {

    public static void main(String[] args) {

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));

    }

    //    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    //
    //    countXX("abcxx") → 1
    //    countXX("xxx") → 2
    //    countXX("xxxx") → 3
    private static int countXX(String str) {

       int XXcount = 0, index = 0;

        while (str.contains("xx")) {
            XXcount++;
            index = str.indexOf("xx")+1;
            str = str.substring(index);
        }
        return XXcount;
    }
}
