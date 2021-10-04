package string1;

/*
Given a string, return a version without the first and last char,
so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
public class WithoutEnd {
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public static void main(String[] args) {
        WithoutEnd withoutEnd = new WithoutEnd();

        System.out.println(withoutEnd.withoutEnd("Hello"));
        System.out.println(withoutEnd.withoutEnd("java"));
        System.out.println(withoutEnd.withoutEnd("coding"));

        String str = "ih";

        String first = str.substring(0,1);
        String last = str.substring(str.length()-1,str.length());
        String middle = str.substring(1,str.length()-1);

        System.out.println(first);
        System.out.println(last);
        System.out.println(middle);
    }
}
