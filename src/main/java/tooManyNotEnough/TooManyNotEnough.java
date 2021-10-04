package tooManyNotEnough;

/*

Choose value from 0 to 100.
If you put number higher that random number chosen by program you will see “too much” comment.
If you choose lower number you’ll see “not enough” comment.
Once you guess correct number you’ll see “BINGO!”.

 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class
TooManyNotEnough {
    public static void main(String[] args) throws InputMismatchException {
        try {
            Random r = new Random();
            Scanner scanner = new Scanner(System.in);
            double programmValue = Math.round(100 * (r.nextDouble()));
            int pV = (int) programmValue;

            while (true) {
                System.out.println("Give value from 0 to 100:");
                int userValue = scanner.nextInt();

                if (userValue > pV) {
                    System.out.println("Too much ;)");
                } else if (userValue < pV) {
                    System.out.println("Not enough :O");
                } else if (userValue == pV) {
                    System.out.println("BINGO");
                    System.exit(0);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input " + e.getMessage());
            e.printStackTrace();
        }
    }
}

