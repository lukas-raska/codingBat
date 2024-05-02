package warmup2.altPairs;

public class Main {

    public static void main(String[] args) {

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    //    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    //
    //    altPairs("kitten") → "kien"
    //    altPairs("Chocolate") → "Chole"
    //    altPairs("CodingHorror") → "Congrr"
    private static String altPairs(String str) {

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            output.append(str, i, Math.min(i + 2, str.length()));
        }
        return output.toString();
    }
}
