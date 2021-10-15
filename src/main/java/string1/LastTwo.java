package string1;

/*
Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
public class LastTwo {
    public String lastTwo(String str) {
        if(str.length()>=2){
            String front = str.substring(0,str.length()-2);
            char oneBeforeLastChar = str.charAt(str.length()-2);
            char lastChar = str.charAt(str.length()-1);
            return front+lastChar+oneBeforeLastChar;
        }
        return str;
    }

    public static void main(String[] args) {
        LastTwo lastTwo = new LastTwo();

        System.out.println(lastTwo.lastTwo("coding"));
        System.out.println(lastTwo.lastTwo("cat"));
        System.out.println(lastTwo.lastTwo("ab"));
        System.out.println("");
        System.out.println(lastTwo.lastTwo("K"));

        String str = "ha";

        //konkatenacja charow:
        char a = 'a';
        char b = 'b';
        char c = 'c';
        System.out.println(""+a+b+c);

        String front = str.substring(0,str.length()-2);
        char oneBeforeLastChar = str.charAt(str.length()-2);
        char lastChar = str.charAt(str.length()-1);

        System.out.println(oneBeforeLastChar);
        System.out.println(lastChar);
        System.out.println(front);
        System.out.println(front + lastChar + oneBeforeLastChar);


    }
}
