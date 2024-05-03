package string3.countYZ;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        System.out.println(countYZ("DAY abc XYZ"));

    }

    //    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in
    //    "fez"  count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a
    //    word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests
    //    if  a char is an alphabetic letter.)
    //
    //    countYZ("fez day") → 2
    //    countYZ("day fez") → 2
    //    countYZ("day fyyyz") → 2
    private static int countYZ(String str) {

        int count = 0;

        for (char c: str.toCharArray()){
            if (!Character.isLetter(c)){
                str=str.replace(c, ' ');
            }
        }

        StringTokenizer tokenizer = new StringTokenizer(str.toLowerCase());

        while(tokenizer.hasMoreElements()){
            String current = tokenizer.nextToken().trim();
            if (current.endsWith("z") || current.endsWith("y")){
                count++;
            }
        }

        return count;
    }
}
