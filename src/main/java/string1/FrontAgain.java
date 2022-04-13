package string1;

/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string,
such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */

public class FrontAgain {
    public boolean frontAgain(String str) {
        if(str.length()<2){
            return false;
        }else if(str.length() == 2 || str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        FrontAgain frontAgain = new FrontAgain();

        System.out.println(frontAgain.frontAgain("edited"));
        System.out.println(frontAgain.frontAgain("ed"));
        System.out.println(frontAgain.frontAgain("edit"));

    }
}