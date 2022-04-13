package string1;

/*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
 */
public class ExtraFront {
    public String extraFront(String str) {
        if(str.length()<2){
            return str+str+str;
        }else {
            String s = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
            return s;
        }
    }

    public static void main(String[] args) {
        ExtraFront extraFront = new ExtraFront();

        System.out.println(extraFront.extraFront("Hello"));
        System.out.println(extraFront.extraFront("ab"));
        System.out.println(extraFront.extraFront(""));
        System.out.println(extraFront.extraFront("H"));

//        String str = "m";
//        //System.out.println(str.substring(0, 2));
//
//        if(str.length()<2){
//            System.out.println(str+str+str);
//        }else {
//            String s = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
//            System.out.println(s);
//        }
    }

}

