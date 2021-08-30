package warmUp1;

/*
Return true if the given string begins with "mix",
except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() > 2) {
            String ix = str.substring(1, 3);
            return (ix.equals("ix"));
        }
        return false;
    }

    /*
    Solution:
public boolean mixStart(String str) {
  // Check if string is too small
  // (so substring() below does not go off the end)
  if (str.length() < 3) return false;

  // Pull out length 2 string for the "ix" part
  // (i.e. substring starting at index 1 and stopping just before 3).
  String two = str.substring(1, 3);

  if (two.equals("ix")) {
    return true;
  } else {
    return false;
  }
  // This last part can be shortened to just:
  // return(two.equals("ix"));
}
     */


    public static void main(String[] args) {
        MixStart mixStart = new MixStart();

        System.out.println(mixStart.mixStart("mix snack"));
        System.out.println(mixStart.mixStart("pix snack"));
        System.out.println(mixStart.mixStart("piz snack"));
        System.out.println(mixStart.mixStart(""));
        System.out.println(mixStart.mixStart("d"));
        System.out.println(mixStart.mixStart("ni"));

    }
}
