package recursion1.allStar;

public class Main {

    public static void main(String[] args) {

        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));

    }

    //    Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
    //
    //    allStar("hello") → "h*e*l*l*o"
    //    allStar("abc") → "a*b*c"
    //    allStar("ab") → "a*b"
    private static String allStar(String str) {

        StringBuilder result = new StringBuilder();

        if (str.isEmpty()){
            return "";
        }

        if (str.length()==1){
            return result.append(str).toString();
        }

        result.append(str.charAt(0)).append("*");

        return result + allStar(str.substring(1));
    }
}
