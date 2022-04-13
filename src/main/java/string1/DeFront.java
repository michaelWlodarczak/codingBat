package string1;

/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
public class DeFront {
    public String deFront(String str) {
        if (str.length() == 2 && str.equalsIgnoreCase("ab")) {
            return str;
        }else if (str.length() == 2 && str.substring(0,1).equalsIgnoreCase("a")){
            return str.substring(0,1);
        } else if (str.length() <= 2) {
            return "";
        } else if (str.substring(0, 2).equalsIgnoreCase("ab")) {
            return str;
        } else if (str.substring(0, 1).equalsIgnoreCase("a")) {
            return str.substring(0, 1) + str.substring(2, str.length());
        } else if (str.substring(1, 2).equalsIgnoreCase("b")) {
            return str.substring(1, str.length());
        } else {
            return str.substring(2, str.length());
        }
    }

    public static void main(String[] args) {
        DeFront deFront = new DeFront();

        System.out.println(deFront.deFront("Hello"));
        System.out.println(deFront.deFront("java"));
        System.out.println(deFront.deFront("away"));
        System.out.println(deFront.deFront(""));
        System.out.println(deFront.deFront("abc"));
        System.out.println(deFront.deFront("a"));
        System.out.println(deFront.deFront("ab"));
        System.out.println(deFront.deFront("ax"));
    }
}
