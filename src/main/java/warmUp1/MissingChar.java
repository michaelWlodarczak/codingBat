package warmUp1;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */

import java.util.function.ToDoubleBiFunction;

public class MissingChar {
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String end = str.substring(n + 1, str.length());
        return front + end;
    }


    public static void main(String[] args) {

        MissingChar missingChar = new MissingChar();

        System.out.println(missingChar.missingChar("Kitten", 1));
        System.out.println(missingChar.missingChar("Kitten", 0));
        System.out.println(missingChar.missingChar("Kitten", 4));


        String str = "miha";
        int n = 1;

        String demo = str.substring(n, n + 1);
        System.out.println(demo);
        String front = str.substring(0, n);
        String end = str.substring(n + 1, str.length());
        System.out.println(front + end);


    }
}
