package string1;

/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */
public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return str;
    }

    public static void main(String[] args) {
        FirstTwo firstTwo = new FirstTwo();

        System.out.println(firstTwo.firstTwo("Hello"));
        System.out.println(firstTwo.firstTwo("abcdefg"));
        System.out.println(firstTwo.firstTwo("ab"));
        System.out.println(firstTwo.firstTwo(""));
        System.out.println(firstTwo.firstTwo("H"));


    }
}
