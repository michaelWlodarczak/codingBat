package warmUp1;

/*
Given 2 positive int values, return the larger value that is in the range
10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class Max1020 {
    public int max1020(int a, int b) {
        boolean aRange = (a >=10 && a <=20);
        boolean bRange = (b >=10 && b <=20);
        if (aRange && bRange && a>b){
            return a;
        }else if (aRange && bRange && a<b){
            return b;
        }else if (aRange && !bRange){
            return a;
        }else if (!aRange && bRange){
            return b;
        }else {
            return 0;
        }
    }

    /*
    Solution:
public int max1020(int a, int b) {
  // First make it so the bigger value is in a
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }

  // Knowing a is bigger, just check a first
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}
     */

    public static void main(String[] args) {
        Max1020 max1020 = new Max1020();

        System.out.println(max1020.max1020(11, 19));
        System.out.println(max1020.max1020(19, 11));
        System.out.println(max1020.max1020(11, 9));
        System.out.println(max1020.max1020(9, 11));
        System.out.println(max1020.max1020(8, 9));
    }
}
