package logic1;

/*
You have a blue lottery ticket, with ints a, b, and c on it.
This makes three pairs, which we'll call ab, bc, and ac.
Consider the sum of the numbers in each pair.
If any pair sums to exactly 10, the result is 10.
Otherwise if the ab sum is exactly 10 more than either bc or ac sums,
the result is 5. Otherwise the result is 0.

blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
 */
public class BlueTicket {

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (ab == 10 || ac == 10 || b + c == 10) {
            return 10;
        } else if (ab == 10 + ac || ab == 10 + bc) {
            return 5;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        BlueTicket blueTicket = new BlueTicket();

        System.out.println(blueTicket.blueTicket(9, 1, 0));
        System.out.println(blueTicket.blueTicket(9, 2, 0));
        System.out.println(blueTicket.blueTicket(6, 1, 4));
        System.out.println(blueTicket.blueTicket(15, 0, 5));
        System.out.println(blueTicket.blueTicket(4, 11, 1));
        System.out.println(blueTicket.blueTicket(13, 2, 3));
    }
}
