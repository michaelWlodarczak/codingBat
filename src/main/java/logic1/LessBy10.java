package logic1;

/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */
public class LessBy10 {

    public boolean lessBy10(int a, int b, int c) {
        return (a>=10+b || a>=10+c || b>=10+c || c>=10+a || c>=10+b);
    }

    public static void main(String[] args) {

        LessBy10 lessBy10 = new LessBy10();

        System.out.println(lessBy10.lessBy10(1, 7, 11));
        System.out.println(lessBy10.lessBy10(1, 7, 10));
        System.out.println(lessBy10.lessBy10(11, 1, 7));
    }
}
