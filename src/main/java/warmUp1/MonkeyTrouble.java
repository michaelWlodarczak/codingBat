package warmUp1;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */

public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        }else if (aSmile == false && bSmile == false){
            return true;
        }else {
            return false;
        }
    }

    public boolean monkeyTroubleShortest(boolean aSmile, boolean bSmile){
        return (aSmile == bSmile);
    }

    /*
    codingBat solution:

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {
    return true;
  }
  if (!aSmile && !bSmile) {
    return true;
  }
  return false;
  // The above can be shortened to:
  //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
  // Or this very short version
  //   return (aSmile == bSmile);
}
     */
    public static void main(String[] args) {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

        System.out.println(monkeyTrouble.monkeyTrouble(true, true));
        System.out.println(monkeyTrouble.monkeyTroubleShortest(true, true));
        System.out.println();
        System.out.println(monkeyTrouble.monkeyTrouble(false, false));
        System.out.println(monkeyTrouble.monkeyTroubleShortest(false, false));
        System.out.println();
        System.out.println(monkeyTrouble.monkeyTrouble(true, false));
        System.out.println(monkeyTrouble.monkeyTroubleShortest(true, false));


    }
}
