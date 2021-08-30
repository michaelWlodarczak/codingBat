package warmUp1;

/*
Given a string, take the first 2 chars and return the string with the 2 chars
added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
public class Front22 {
    public String front22(String str) {
        if (str.length() > 2) {
            String F2 = str.substring(0, 2);
            return F2 + str + F2;
        } else {
            return str + str + str;
        }
    }
    /*
    Solution:
public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }

  String front = str.substring(0, take);
  return front + str + front;
}
     */

    public static void main(String[] args) {
        Front22 front22 = new Front22();

        System.out.println(front22.front22("Hania"));
        System.out.println(front22.front22("H"));
        System.out.println(front22.front22("Mi"));
        System.out.println(front22.front22("abc"));


    }
}
