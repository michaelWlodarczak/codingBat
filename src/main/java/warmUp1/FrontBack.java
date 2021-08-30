package warmUp1;

/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class FrontBack {
    //moja metoda, jest o tyle zla, ze powinno nie uzywac sie sout w srodku metody
//    public String frontBack(String str) {
//        if (str.length() > 1) {
//            System.out.print(str.charAt(str.length() - 1));
//            for (int i = 1; i < str.length() - 1; i++) {
//                System.out.print(str.charAt(i));
//            }
//            System.out.print(str.charAt(0));
//        } else {
//            System.out.print(str);
//        }
//        return str;
//    }

    /*
    Solution:
    */
    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;
        String mid = str.substring(1, str.length() - 1);
        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }


    public static void main(String[] args) {
        FrontBack frontBack = new FrontBack();

        System.out.println(frontBack.frontBack("code"));
        System.out.println();
        System.out.println(frontBack.frontBack("a"));
        System.out.println();
        System.out.println(frontBack.frontBack("ab"));

//        String str = "H";
//
//        if (str.length() > 1) {
//            System.out.print(str.charAt(str.length() - 1));
//            for (int i = 1; i < str.length() - 1; i++) {
//                System.out.print(str.charAt(i));
//            }
//            System.out.print(str.charAt(0));
//        } else {
//            System.out.println(str);
//        }

    }
}
