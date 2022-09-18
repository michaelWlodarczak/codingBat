package logic1;

/*
Given two ints, each in the range 10..99,
return true if there is a digit that appears in both numbers,
such as the 2 in 12 and 23.
(Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */
public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        return a/10==b/10 || a%10==b/10 || a/10==b%10 || a%10==b%10;
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 23;

        System.out.println(a % 10);
        System.out.println(b % 10);
        System.out.println(a / 10);
        System.out.println(b / 10+"\n");

        ShareDigit shareDigit = new ShareDigit();

        System.out.println(shareDigit.shareDigit(12, 23));
        System.out.println(shareDigit.shareDigit(12, 43));
        System.out.println(shareDigit.shareDigit(12, 44));
    }
}
