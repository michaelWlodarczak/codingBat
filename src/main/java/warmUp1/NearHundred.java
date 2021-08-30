package warmUp1;

/*
Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

 */
public class NearHundred {
    public boolean nearHundred(int n) {
        if (n >= 90 && n <= 110) {
            return true;
        } else if (n >= 190 && n <= 210) {
        return true;
        }
        return false;
    }

    /*
    Solution:
public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}
     */

    public static void main(String[] args) {
        //System.out.println(Math.abs(10));
        NearHundred nearHundred = new NearHundred();
        System.out.println(nearHundred.nearHundred(93));
        System.out.println(nearHundred.nearHundred(90));
        System.out.println(nearHundred.nearHundred(76));
        System.out.println(nearHundred.nearHundred(196));
        System.out.println(nearHundred.nearHundred(176));
        System.out.println(nearHundred.nearHundred(210));
    }
}
