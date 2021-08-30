package warmUp1;

/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class Close10 {
    public int close10(int a, int b) {
        if(Math.abs(10-a) > Math.abs(10-b)){
            return b;
        }else if (Math.abs(10-a)<Math.abs(10-b)){
            return a;
        }else {
            return 0;
        }
    }

    /*
    Solution:
public int close10(int a, int b) {
  int aDiff = Math.abs(a - 10);
  int bDiff = Math.abs(b - 10);

  if (aDiff < bDiff) {
    return a;
  }
  if (bDiff < aDiff) {
    return b;
  }
  return 0;  // i.e. aDiff == bDiff

  // Solution notes: aDiff/bDiff local vars clean the code up a bit.
  // Could have "else" before the second if and the return 0.
}
     */

    public static void main(String[] args) {
        Close10 close10 = new Close10();

        System.out.println(close10.close10(8, 13));
        System.out.println(close10.close10(13, 8));
        System.out.println(close10.close10(13, 7));

        System.out.println(Math.abs(10-(-11)));
    }
}
