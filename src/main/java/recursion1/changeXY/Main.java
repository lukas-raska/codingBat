package recursion1.changeXY;

public class Main {

    public static void main(String[] args) {

        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
    }

    //    Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been
    //    changed to 'y' chars.
    //
    //    changeXY("codex") → "codey"
    //    changeXY("xxhixx") → "yyhiyy"
    //    changeXY("xhixhix") → "yhiyhiy"
    private static String changeXY(String str) {

        StringBuilder result = new StringBuilder();

        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("x")){
            result.append("y");
        } else {
            result.append(str.charAt(0));
        }
        return result + changeXY(str.substring(1));

    }
}
