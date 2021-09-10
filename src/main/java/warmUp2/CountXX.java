package warmUp2;

/*
Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

public class CountXX {
    int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("xx")){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        CountXX countXX = new CountXX();

        System.out.println(countXX.countXX("abcxx"));
        System.out.println(countXX.countXX("xxx"));
        System.out.println(countXX.countXX("xxxx"));
        System.out.println(countXX.countXX("abcd"));
        System.out.println(countXX.countXX("x"));


        String str = "xxx";

        int counter = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("xx")){
                counter++;
            }
            System.out.println(str.substring(i, i + 2));
        }
        System.out.println(counter);
    }
}
