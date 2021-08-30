package warmUp1;

/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }

    /*
    Solution:
public boolean icyHot(int temp1, int temp2) {
  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
    return true;
  } else {
    return false;
  }
  // Could be written as: return ((temp1 < 0 && ...));
}
     */

    public static void main(String[] args) {
        IcyHot icyHot = new IcyHot();

        System.out.println(icyHot.icyHot(120, -1));
        System.out.println(icyHot.icyHot(-1, 120));
        System.out.println(icyHot.icyHot(2, 120));
        System.out.println();
        System.out.println(icyHot.icyHot(-1,-20));
        System.out.println(icyHot.icyHot(10,100));
        System.out.println(icyHot.icyHot(0,100));
    }
}
