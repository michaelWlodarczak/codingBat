package string1;

/*
Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

public class MiddleTwo {
    public String middleTwo(String str) {
        int half = str.length()/2;
        return str.substring(half - 1, half + 1);
    }



    public static void main(String[] args) {
        MiddleTwo middleTwo = new MiddleTwo();

        System.out.println(middleTwo.middleTwo("string"));
        System.out.println(middleTwo.middleTwo("code"));
        System.out.println(middleTwo.middleTwo("Practise"));
        System.out.println(middleTwo.middleTwo("thikmiha"));
        System.out.println(middleTwo.middleTwo("ab"));

    }
}
