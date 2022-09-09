package logic1;

/*
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true

public boolean love6(int a, int b) {

}
 */
public class Love6 {

//    public boolean love6(int a, int b) {
//        int a1 = Math.abs(a);
//        int b1 = Math.abs(b);
//        return ((a1 + b1 == 6) || ((a1 - b1 == 6) || (b1 - a1 == 6)) || (a1 == 6 || b1 == 6));
//    }

    public boolean love6(int a, int b) {
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        if (a1 + b1 == 6) {
            return true;
        }else if ((a1 + b1 == 6) && (a1 == 6 || b1 == 6)){
            return false;
        }else if ((a1 - b1 == 6) || (b1 - a1 == 6)){
            return true;
        }else if (a1 == 6 || b1 == 6){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

        Love6 love6 = new Love6();

        System.out.println(love6.love6(6, 4));
        System.out.println(love6.love6(4, 5));
        System.out.println(love6.love6(1, 5));
        System.out.println(love6.love6(-8, 2));
        System.out.println(love6.love6(7, -1));

        System.out.println(love6.love6(-6, 2));
        System.out.println(love6.love6(-7, 1));
        System.out.println(love6.love6(-2, -4));


    }

}
