package recursion1.countX;

public class Main {

    public static void main(String[] args) {

        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));

    }

    //    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
    //
    //    countX("xxhixx") → 4
    //    countX("xhixhix") → 3
    //    countX("hi") → 0
    private static int countX(String str) {

        if (str.isEmpty()){
            return 0;
        }

        return ((str.startsWith("x")? 1:0) + countX(str.substring(1)));
    }
}
