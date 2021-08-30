package warmUp1;

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

Biorąc pod uwagę 2 wartości int, zwróć prawdę, jeśli jedna jest ujemna, a druga dodatnia.
Z wyjątkiem sytuacji, gdy parametr „ujemny” jest prawdziwy, zwróć prawdę tylko wtedy, gdy oba są ujemne.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */
public class PosNeg {
    //    public boolean posNeg(int a, int b, boolean negative) {
//        if (a < 0 && b > 0 && negative == false) {
//            return true;
//        }else if(a>0 && b <0 && negative == false){
//            return true;
//        }else if (a<0 && b <0 && negative == true){
//            return true;
//        }
//        return false;
//    }
    public boolean posNeg(int a, int b, boolean negative) {
        return ((a < 0 && b > 0 && negative == false) || (a > 0 && b < 0 && negative == false) || (a < 0 && b < 0 && negative == true));
    }

    /*
    Solution:
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}
     */


    public static void main(String[] args) {
        PosNeg posNeg = new PosNeg();

        System.out.println(posNeg.posNeg(1, -1, false));
        System.out.println(posNeg.posNeg(-1, 1, false));
        System.out.println(posNeg.posNeg(-4, -5, true));
        System.out.println(posNeg.posNeg(1, 2, false));
    }
}
