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
//    public String missingChar(String str, int n) {

//    }
//TODO
    /*
    Solution:
public String missingChar(String str, int n) {
  String front = str.substring(0, n);

  // Start this substring at n+1 to omit the char.
  // Can also be shortened to just str.substring(n+1)
  // which goes through the end of the string.
  String back = str.substring(n+1, str.length());

  return front + back;
}
     */

    public static void main(String[] args) {

       // MissingChar missingChar = new MissingChar();
        String str = "dupa";
        int n = 1;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println(str.length());
    }
}
