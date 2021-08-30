package warmUp1;

import com.sun.jdi.Value;

import java.util.Arrays;

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        int max;
        max =a;
        int[] array = {a, b, c};
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }return max;
    }
/*
Solution:
public int intMax(int a, int b, int c) {
  int max;

  // First check between a and b
  if (a > b) {
    max = a;
  } else {
    max = b;
  }

  // Now check between max and c
  if (c > max) {
    max = c;
  }

  return max;

  // Could use the built in Math.max(x, y) function which selects the larger
  // of two values.
}
 */




    public static void main(String[] args) {
        IntMax intMax = new IntMax();

        System.out.println(intMax.intMax(1, 2, 3));
        System.out.println(intMax.intMax(11, 22, 3));
        System.out.println(intMax.intMax(111, 2, 3));
        System.out.println(intMax.intMax(-1, -2, -3));


//        int max = 0;
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int[] array = {a, b, c};
//        System.out.println(array[0]);
//
//        for (int i = 0; i < array.length; i++) {
//            if(max<array[i]){
//               max=array[i];
//            }
//        }
//        System.out.println(max);

    }


}



