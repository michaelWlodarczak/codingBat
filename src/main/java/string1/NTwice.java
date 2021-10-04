package string1;

/*
Given a string and an int n, return a string made of the first and last n chars from the string.
The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */

public class NTwice {
    public String nTwice(String str, int n) {
        String beg = str.substring(0,n);
        String end = str.substring(str.length()-n,str.length());
        return beg+end;
    }

    public static void main(String[] args) {
        NTwice nTwice = new NTwice();

        System.out.println(nTwice.nTwice("Hello", 2));
        System.out.println(nTwice.nTwice("Chocolate", 3));
        System.out.println(nTwice.nTwice("Chocolate", 1));
        System.out.println(nTwice.nTwice("PATHfinder", 3));

    }
}
