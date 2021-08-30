package warmUp1;

/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartHi {
    public boolean startHi(String str) {
        if (str.length() >= 2) {
            String hi = "hi";
            String two = str.substring(0, 2);
            return hi.equals(two);
        }return false;
    }

    /*
    Solution:
public boolean startHi(String str) {
  // First test if the string is not at least length 2
  // (so the substring() below does not go past the end).
  if (str.length() < 2) return false;

  // Pull out the string of the first two chars
  String firstTwo = str.substring(0, 2);

  // Test if it is equal to "hi"
  if (firstTwo.equals("hi")) {
    return true;
  } else {
    return false;
  }
  // This last part can be shortened to: return(firstTwo.equals("hi"));
}
     */

    public static void main(String[] args) {
        StartHi startHi = new StartHi();

//        System.out.println(startHi.startHi("hi there"));
//        System.out.println(startHi.startHi("hi"));
//        System.out.println(startHi.startHi("hello hi"));
//        System.out.println(startHi.startHi("miha"));
//        System.out.println(startHi.startHi("himiha"));
//        System.out.println(startHi.startHi("H"));
//        System.out.println(startHi.startHi(""));
        String m = "miha";
        System.out.println(m.length());

    }
}
