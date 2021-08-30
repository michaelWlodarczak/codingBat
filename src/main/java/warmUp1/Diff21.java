package warmUp1;

//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.
//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0

//        dif21(23) -> 2
//        dif21(-2) -> 23

public class Diff21 {
    public int diff21(int n) {
        if (n <= 21 && n >= 0){
            return 21 - n;
        }else if (n>21){
            return (n - 21) * 2;
        }else {
            return (0-n) + 21;
        }
    }

    /*
    Solution from codingBat:
    public int diff21(int n) {
  if (n <= 21) {
    return 21 - n;
  } else {
    return (n - 21) * 2;
  }
}
     */

    public static void main(String[] args) {
        // get some integers to find their absolute values
//        int x = 175;
//        int y = -184;
//
//        // get and print their absolute values
//        System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
//        System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
//        System.out.println("Math.abs(-0)=" + Math.abs(-0));

        Diff21 diff21 = new Diff21();
        System.out.println(diff21.diff21(19));
        System.out.println(diff21.diff21(10));
        System.out.println(diff21.diff21(21));
        System.out.println(diff21.diff21(22));
        System.out.println(diff21.diff21(25));
        System.out.println(diff21.diff21(30));
        System.out.println(diff21.diff21(0));
        System.out.println(diff21.diff21(1));
        System.out.println(diff21.diff21(2));
        System.out.println(diff21.diff21(-1));
        System.out.println(diff21.diff21(-2));
        System.out.println(diff21.diff21(50));

    }
}
