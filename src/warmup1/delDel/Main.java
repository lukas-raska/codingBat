package warmup1.delDel;

public class Main {

    public static void main(String[] args) {

        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    //    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    //
    //    delDel("adelbc") → "abc"
    //    delDel("adelHello") → "aHello"
    //    delDel("adedbc") → "adedbc"
    private static String delDel(String str) {
        if (str.startsWith("del",1)){
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
}
