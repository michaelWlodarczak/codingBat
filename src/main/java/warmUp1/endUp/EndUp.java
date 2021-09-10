package warmUp1.endUp;

/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class EndUp {
    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String beg = str.substring(0, str.length()-3);
            String end = str.substring(str.length()-3, str.length()).toUpperCase();
            return beg+end;
        }
    }

    /*
    Solution:
public String endUp(String str) {
  if (str.length() <= 3) return str.toUpperCase();
  int cut = str.length() - 3;
  String front = str.substring(0, cut);
  String back  = str.substring(cut);  // this takes from cut to the end

  return front + back.toUpperCase();
}
     */


    public static void main(String[] args) {
        EndUp endUp = new EndUp();

        System.out.println(endUp.endUp("Hello"));
        System.out.println(endUp.endUp("hi there"));
        System.out.println(endUp.endUp("hi"));
        System.out.println(endUp.endUp("abcd"));
        System.out.println(endUp.endUp("abcd"));


    }
}
