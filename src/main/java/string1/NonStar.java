package string1;

/*
Given 2 strings, return their concatenation, except omit the first char of each.
The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
public class NonStar {
//    public String nonStart(String a, String b) {
//        String nonA = a.substring(1,a.length());
//        String nonB = b.substring(1,b.length());
//        return nonA+nonB;
//    }

    public String nonStart(String a, String b) {
        return a.substring(1,a.length())+b.substring(1,b.length());
    }



    public static void main(String[] args) {
        NonStar nonStar = new NonStar();

        System.out.println(nonStar.nonStart("Hello", "There"));
        System.out.println(nonStar.nonStart("java", "code"));
        System.out.println(nonStar.nonStart("shotl", "java"));


    }
}
