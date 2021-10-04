package string1;

/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */
public class Left2 {
    //    public String left2(String str) {
//        String first = str.substring(0, 2);
//        String second = str.substring(2, str.length());
//        return second + first;
//    }
    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }


    public static void main(String[] args) {
        Left2 left2 = new Left2();

        System.out.println(left2.left2("Hello"));
        System.out.println(left2.left2("java"));
        System.out.println(left2.left2("Hi"));
    }
}
