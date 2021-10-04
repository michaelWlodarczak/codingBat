package string1;

/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */
public class Right2 {
//    public String right2(String str) {
//        String right = str.substring(str.length() - 2, str.length());
//        String left = str.substring(0, str.length() - 2);
//        return right+left;
//    }

    public String right2(String str) {
        return str.substring(str.length() - 2, str.length())+
        str.substring(0, str.length() - 2);
    }



    public static void main(String[] args) {
        Right2 right2 = new Right2();

        System.out.println(right2.right2("Hello"));
        System.out.println(right2.right2("java"));
        System.out.println(right2.right2("Hi"));

    }
}
