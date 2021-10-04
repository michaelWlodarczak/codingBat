package string1;

/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
public class ExtraEnd {
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2, str.length());
        return lastTwo+lastTwo+lastTwo;
    }

    public static void main(String[] args) {

        ExtraEnd extraEnd = new ExtraEnd();

        System.out.println(extraEnd.extraEnd("Hello"));
        System.out.println(extraEnd.extraEnd("ab"));
        System.out.println(extraEnd.extraEnd("Hi"));


    }
}
