package string1;

/*
Given a string, return a string length 1 from its front,
unless front is false, in which case return a string length 1 from its back.
The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
public class TheEnd {
    public String theEnd(String str, boolean front) {
        if(front == true){
            return str.substring(0,1);
        }
        return str.substring(str.length() - 1, str.length());
    }

    public static void main(String[] args) {
        TheEnd theEnd = new TheEnd();

        String str = "miha";
        System.out.println(str.substring(str.length() - 1, str.length()));


        System.out.println(theEnd.theEnd("Hello", true));
        System.out.println(theEnd.theEnd("Hello", false));
        System.out.println(theEnd.theEnd("oh", true));
    }
}

