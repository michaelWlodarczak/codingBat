package logic1;

/*
You have a green lottery ticket, with ints a, b, and c on it.
If the numbers are all different from each other, the result is 0.
If all of the numbers are the same, the result is 20.
If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */
public class GreenTicket {

    public int greenTicket(int a, int b, int c) {
        if (a!=b && a!=c && b!=c){
            return 0;
        }else if ((a==b && a!=c) || (a!=b && b==c) || (a!=b && a==c)){
            return 10;
        }else {
            return 20;
        }
    }

    public static void main(String[] args) {

        GreenTicket greenTicket = new GreenTicket();

        System.out.println(greenTicket.greenTicket(1, 2, 3));
        System.out.println(greenTicket.greenTicket(2, 2, 2));
        System.out.println(greenTicket.greenTicket(1, 1, 2));
    }
}
