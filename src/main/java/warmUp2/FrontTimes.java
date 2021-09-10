package warmUp2;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String empty = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                empty += str;
            }
            return empty;
        }else if (str.length() >= 3) {
            String three = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                empty += three;
            }
        }
        return empty;
    }

    /*
    Solution:
public String frontTimes(String str, int n) {
  int frontLen = 3;
  if (frontLen > str.length()) {
    frontLen = str.length();
  }
  String front = str.substring(0, frontLen);

  String result = "";
  for (int i=0; i<n; i++) {
    result = result + front;
  }
  return result;
}
     */

    public static void main(String[] args) {
        FrontTimes frontTimes = new FrontTimes();

        System.out.println(frontTimes.frontTimes("Chocolate", 2));
        System.out.println(frontTimes.frontTimes("Chocolate", 3));
        System.out.println(frontTimes.frontTimes("Ab", 4));

//        int n = 4;
//        String str = "mi";
//
//        String empty = "";
//
//        if (str.length() < 3) {
//            for (int i = 0; i < n; i++) {
//                empty += str;
//            }
//            System.out.println(empty);
//        } else if (str.length()>=3){
//            String three = str.substring(0, 3);
//            for (int i = 0; i < n; i++) {
//                empty += three;
//            }
//            System.out.println(empty);
//        }
    }
}

