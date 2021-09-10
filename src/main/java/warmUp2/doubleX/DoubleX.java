package warmUp2.doubleX;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class DoubleX {
    boolean doubleX(String str) {
        int a = str.indexOf('x');
        int b = str.length() - 1;
        if (a == b) {
            return false;
        } else if (str.length() >= 2) {
            String xx = str.substring(str.indexOf('x') + 1, str.indexOf('x') + 2);
            return "x".equals(xx);
        }
        return false;
    }

    /*
    Hint:
Use the indexOf() method to find the first "x" in the string.
     */

    /*
    Solution:
boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false; // no "x" at all

  // Is char at i+1 also an "x"?
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");

  // Another approach -- .startsWith() simplifies the logic
  // String x = str.substring(i);
  // return x.startsWith("xx");
}
     */
    public static void main(String[] args) {
        DoubleX doubleX = new DoubleX();

        System.out.println(doubleX.doubleX("aaaax"));
        System.out.println(doubleX.doubleX("axxbb"));
        System.out.println(doubleX.doubleX("axaxaxax"));
        System.out.println(doubleX.doubleX("xxxxx"));


    }
}
