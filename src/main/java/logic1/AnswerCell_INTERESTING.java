package logic1;

/*
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 */

public class AnswerCell_INTERESTING {

//    STEP ONE
//    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//        if (isMorning && isMom && !isAsleep){
//            return true;
//        }else if (isMorning && !isMom && !isAsleep){
//            return false;
//        }else if (!isMorning && !isAsleep){
//            return true;
//        }else if (isAsleep){
//            return false;
//        }
//        return false;
//    }


//    STEP TWO
//    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//        if ((isMorning && isMom && !isAsleep) || (!isMorning && !isAsleep)){
//            return true;
//        }else if ((isMorning && !isMom && !isAsleep) || (isAsleep)) {
//            return false;
//        }
//        return false;
//    }


//    STEP THREE
//    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//        if ((isMorning && !isMom) || isAsleep) {
//            return false;
//        } else {
//            return true;
//        }
//    }

    //STEP FOUR - FINAL ANSWER >>ONELINER<<
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isMorning || isMom) && !isAsleep;
    }

    public static void main(String[] args) {

        AnswerCell_INTERESTING answerCell = new AnswerCell_INTERESTING();

        System.out.println(answerCell.answerCell(false, false, false));
        System.out.println(answerCell.answerCell(false, false, true));
        System.out.println(answerCell.answerCell(true, false, false));

    }
}
