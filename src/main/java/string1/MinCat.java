package string1;

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths,
omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */

public class MinCat {
    public String minCat(String a, String b) {
        if(a.length()>b.length()){
            return a.substring(a.length() - b.length(), a.length()) + b;
        }else if(b.length()>a.length()){
            return a + b.substring(b.length() - a.length(), b.length());
        }else {
            return a + b;
        }
    }


    public static void main(String[] args) {
        MinCat minCat = new MinCat();

        System.out.println(minCat.minCat("Hello", "Hi"));
        System.out.println(minCat.minCat("Hello", "java"));
        System.out.println(minCat.minCat("java", "Hello"));
        System.out.println(minCat.minCat("x", "abc"));




    }
}
