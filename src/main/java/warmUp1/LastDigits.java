package warmUp1;

/*
Given two non-negative int values, return true if they have the same last digit,
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
public class LastDigits {
    public boolean lastDigit(int a, int b) {
        return (a%10 == b%10);
    }

    public static void main(String[] args) {
        LastDigits lastDigits = new LastDigits();

        System.out.println(lastDigits.lastDigit(7, 17));
        System.out.println(lastDigits.lastDigit(6, 17));
        System.out.println(lastDigits.lastDigit(3, 113));
        System.out.println(lastDigits.lastDigit(3, 23));
        System.out.println(lastDigits.lastDigit(8, 18));
        System.out.println(lastDigits.lastDigit(9, 998));

        int a;
        a=26;
        System.out.println(a%10);


    }

}
