package string1;

/*
Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */

public class WithoutEnd2 {
    public String withouEnd2(String str) {
        if(str.length()>=3){
            return str.substring(1,str.length()-1);
        }
        return "";
    }

    public static void main(String[] args) {
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();

        System.out.println(withoutEnd2.withouEnd2("Hello"));
        System.out.println(withoutEnd2.withouEnd2("abc"));
        System.out.println(withoutEnd2.withouEnd2("ab"));
        System.out.println(withoutEnd2.withouEnd2("m"));
        System.out.println(withoutEnd2.withouEnd2(""));


    }
}
