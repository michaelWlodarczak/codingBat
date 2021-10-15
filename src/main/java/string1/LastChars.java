package string1;

/*
Given 2 strings, a and b, return a new string made of the first char
of a and the last char of b, so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

 */
public class LastChars {
    public String lastChars(String a, String b) {
        if (a.length()>=1 && b.length() >=1){
            return a.substring(0,1)+b.substring(b.length()-1,b.length());
        }else if (a.length()>=1 && b.length()==0){
            return a.substring(0,1)+"@";
        }else if (a.length()==0 && b.length() >=1){
            return "@"+b.substring(b.length()-1,b.length());
        }
        return "@@";
    }



    public static void main(String[] args) {
        LastChars lastChars = new LastChars();

        System.out.println(lastChars.lastChars("last", "char"));
        System.out.println(lastChars.lastChars("yo", "java"));
        System.out.println(lastChars.lastChars("hi", ""));
        System.out.println(lastChars.lastChars("", "Michal"));
        System.out.println(lastChars.lastChars("", ""));


        String b = "";
        System.out.println(b.length());

    }


}
