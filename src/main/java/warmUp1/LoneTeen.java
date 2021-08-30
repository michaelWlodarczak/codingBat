package warmUp1;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a>=13 && a <20);
        boolean bTeen = (b>=13 && b <20);
        if (aTeen && !bTeen){
            return true;
        }else if (!aTeen && bTeen){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        LoneTeen loneTeen = new LoneTeen();

        System.out.println(loneTeen.loneTeen(13, 99));
        System.out.println(loneTeen.loneTeen(21, 19));
        System.out.println(loneTeen.loneTeen(13, 13));
        System.out.println();
        System.out.println(loneTeen.loneTeen(8,7));

    }
}
