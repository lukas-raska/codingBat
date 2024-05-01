package logic1.fizzString;

public class Main {

    public static void main(String[] args) {

        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));

    }

    //    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
    //    If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string
    //    unchanged. (See also: FizzBuzz Code)
    //
    //    fizzString("fig") → "Fizz"
    //    fizzString("dib") → "Buzz"
    //    fizzString("fib") → "FizzBuzz"
    private static String fizzString(String str) {
        String output = "";
        if (str.startsWith("f")) {
            output += "Fizz";
        }
        if (str.endsWith("b")) {
            output += "Buzz";
        }
        return (output.isEmpty()) ? str : output;
    }
}
