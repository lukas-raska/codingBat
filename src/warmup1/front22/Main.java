package warmup1.front22;

public class Main {

    public static void main(String[] args) {

        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));

    }

    //    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and
    //    back,  so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
    //
    //    front22("kitten") → "kikittenki"
    //    front22("Ha") → "HaHaHa"
    //    front22("abc") → "ababcab"
    private static String front22(String str) {
        String front = (str.length() < 2) ? str : str.substring(0, 2);
        return front + str + front;
    }
}
