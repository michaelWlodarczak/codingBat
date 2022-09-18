package logic1;

/*
Given two int values, return whichever value is larger.
However if the two values have the same remainder when divided by 5,
then the return the smaller value.
However, in all cases, if the two values are the same, return 0.
Note: the % "mod" operator computes the remainder, e.g.

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
 */
public class MaxMod5 {

    public int maxMod5(int a, int b) {
        if (a%5==b%5 && a<b){
            return a;
        }else if (a%5==b%5 && a>b) {
            return b;
        }else if (a>b) {
            return a;
        }else if (a<b){
            return b;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

        MaxMod5 maxMod5 = new MaxMod5();

        System.out.println(maxMod5.maxMod5(2, 3));
        System.out.println(maxMod5.maxMod5(6, 2));
        System.out.println(maxMod5.maxMod5(3, 2));
        System.out.println(maxMod5.maxMod5(9, 14));
        System.out.println(maxMod5.maxMod5(11, 6));
        System.out.println(maxMod5.maxMod5(7, 7));


    }
}
