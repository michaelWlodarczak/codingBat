package warmUp1;

/*
Given a string, take the last char and return
a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
public class BackAround {
    public String backAround(String str) {
        String last = String.valueOf(str.charAt(str.length()-1));
        return last+str+last;
    }

    /*
    Solution:
public String backAround(String str) {
  // Get the last char
  String last = str.substring(str.length() - 1);
  return last + str + last;
}
     */



    public static void main(String[] args) {
        BackAround backAround = new BackAround();
        System.out.println(backAround.backAround("cat"));
        System.out.println(backAround.backAround("Hello"));
        System.out.println(backAround.backAround("a"));



    }
}
