package warmUp1;

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
 */

public class Or35 {
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }return false;
    }

    /*
    Solution:
public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}
     */

    public static void main(String[] args) {
        Or35 or35 = new Or35();
        System.out.println(or35.or35(3));
        System.out.println(or35.or35(5));
        System.out.println(or35.or35(15));
        System.out.println(or35.or35(19));

    }
}
