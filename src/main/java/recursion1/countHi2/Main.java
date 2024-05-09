package recursion1.countHi2;

public class Main {

    public static void main(String[] args) {

                System.out.println(countHi2("ahixhi"));
                System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }

    //    Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do
    //    not  count "hi" that have an 'x' immedately before them.
    //
    //    countHi2("ahixhi") → 1
    //    countHi2("ahibhi") → 2
    //    countHi2("xhixhi") → 0
    private static int countHi2(String str) {

        if (str.length() < 3) {
            return str.equals("hi") ? 1 : 0;
        }

        int count = 0;
        int step = 1; //specifies how much to move when calling the method recursively

        if (str.startsWith("hi")) {
            count++;
            step = 2;
        }
        if (str.startsWith("hi", 1)){
            step = 3;
            if(!str.startsWith("x")){
                count++;
            }
        }

        return count + countHi2(str.substring(step));

    }
}
