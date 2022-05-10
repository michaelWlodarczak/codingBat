package array1;

/*
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

//TODO maby more simple?
public class Start1 {
    public int start1(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return 0;
        } else if (a.length == 0 && b.length > 0) {
            if (b[0] == 1) return 1;
            else return 0;
        } else if (a.length > 0 && b.length == 0) {
            if (a[0] == 1) return 1;
            else return 0;
        } else if (a.length == 0 && b.length > 0) {
            if (b[0] == 1) return 1;
            else return 0;
        } else if (a.length > 0 && b.length > 0) {
            if (a[0] == 1 && b[0] == 1) return 2;
            if ((a[0] == 1 && b[0] != 1) || (a[0] != 1 && b[0] == 1)) return 1;
            if (a[0] != 1 && b[0] != 1) return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {};

        Start1 start1 = new Start1();
        System.out.println(start1.start1(a, b));


    }
}

