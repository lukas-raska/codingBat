package string3.maxBlock;

public class Main {

    public static void main(String[] args) {

        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }

    //    Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars
    //    that are the same.
    //
    //    maxBlock("hoopla") → 2
    //    maxBlock("abbCCCddBBBxx") → 3
    //    maxBlock("") → 0
    private static int maxBlock(String str) {

        int maxBlockLength = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int currentBlockLength = 0;
            for (int j = i; j < str.length() ; j++) {
                if (current == str.charAt(j)){
                    currentBlockLength++;
                }else {
                    break;
                }
            }
            maxBlockLength = Math.max(currentBlockLength,maxBlockLength);

        }
        return maxBlockLength;
    }
}
