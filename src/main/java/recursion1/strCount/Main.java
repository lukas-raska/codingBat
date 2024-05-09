package recursion1.strCount;

public class Main {

    public static void main(String[] args) {

        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
    }

    //    Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in
    //    the string, without the sub strings overlapping.
    //
    //    strCount("catcowcat", "cat") → 2
    //    strCount("catcowcat", "cow") → 1
    //    strCount("catcowcat", "dog") → 0
    private static int strCount(String str,
                                String sub) {
        if (str.length()<sub.length()){
            return 0;
        }
        int count = 0;
        int step = 1;

        if (str.startsWith(sub)){
            count++;
            step = sub.length();
        }

        return count + strCount(str.substring(step),sub);

    }
}
