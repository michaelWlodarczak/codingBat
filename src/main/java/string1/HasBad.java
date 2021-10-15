package string1;

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
public class HasBad {
//    public boolean hasBad(String str) {
//        if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
//            return true;
//        }
//        return false;
//    }
    public boolean hasBad(String str) {
        if(str.length()==3){
            return (str.substring(0,3).equals("bad"));
        }else if (str.length()>3){
            return (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"));
        }
        return false;
    }

    public static void main(String[] args) {
        HasBad hasBad = new HasBad();

        System.out.println(hasBad.hasBad("badxxx"));
        System.out.println(hasBad.hasBad("xbadxxx"));
        System.out.println(hasBad.hasBad("xxbadxxx"));
        System.out.println(hasBad.hasBad("x"));
        System.out.println(hasBad.hasBad("dup"));
        System.out.println(hasBad.hasBad("bad"));



    }


}
