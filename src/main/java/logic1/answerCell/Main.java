package logic1.answerCell;

public class Main {

    public static void main(String[] args) {

        System.out.println(answerCell(false,false,false));
        System.out.println(answerCell(false,false,true));
        System.out.println(answerCell(true,false,false));

    }

    //    Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you
    //    only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
    //
    //    answerCell(false, false, false) → true
    //    answerCell(false, false, true) → false
    //    answerCell(true, false, false) → false
    private static boolean answerCell(boolean isMorning,
                                      boolean isMom,
                                      boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            return isMom;
        }
        return true;
    }
}
