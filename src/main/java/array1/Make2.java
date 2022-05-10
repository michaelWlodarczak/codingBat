package array1;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, return a new array length 2 containing,
as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0,
but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
public class Make2 {
    public int[] make2(int[] a, int[] b) {
        if (a.length == 0 && b.length >= 2) {
            int[] c = {b[0], b[1]};
            return c;
        }
//        if (a.length >= 2) {
//            int[] c = {a[0], a[1]};
//            return c;
//        }
        if (a.length == 1 && b.length >= 1) {
            int[] c = {a[0], b[0]};
            return c;
        }else {
            int[]c={a[0],a[1]};
            return c;
        }

    }

    public static void main(String[] args) {

        int[] a = {3,4};
        int[] b = {6,7};


//        if (a.length == 0 && b.length >= 2) {
//            int[] c = {b[0], b[1]};
//            System.out.println(Arrays.toString(c));
//        }
//        if (a.length >= 2) {
//            int[] c = {a[0], a[1]};
//            System.out.println(Arrays.toString(c));
//        }
//        if (a.length == 1 && b.length >= 1) {
//            int[] c = {a[0], b[0]};
//            System.out.println(Arrays.toString(c));
//        }


    }
}

