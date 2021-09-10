package warmUp2.stringYak;

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
public class StringYak {
    public String stringYak(String str) {
        String result = "";
        if (str.length() >= 3) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("yak")) {
                    result = str.replace("yak", "");
                }
            }
            return result;
        } else {
            return str;
        }
    }

    /*
    Solution:
public String stringYak(String str) {
  String result = "";

  for (int i=0; i<str.length(); i++) {
    // Look for i starting a "yak" -- advance i in that case
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else { // Otherwise do the normal append
      result = result + str.charAt(i);
    }
  }

  return result;
}
     */

    public static void main(String[] args) {
        StringYak stringYak = new StringYak();

        System.out.println(stringYak.stringYak("yakpak"));
        System.out.println(stringYak.stringYak("pakyak"));
        System.out.println(stringYak.stringYak("yak123ya"));
        System.out.println(stringYak.stringYak("ya"));
        System.out.println(stringYak.stringYak("dupayakchaloopa"));

    }
}
