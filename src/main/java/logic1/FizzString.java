package logic1;

/*
Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz".
In all other cases, return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */
public class FizzString {

//    public String fizzString(String str) {
//        if(str.substring(0,1).equals("f") && str.substring(str.length()-1,str.length()).equals("b")){
//            return "FizzBuzz";
//        }else if (str.substring(0,1).equals("f")){
//            return "Fizz";
//        }else if (str.substring(str.length()-1,str.length()).equals("b")){
//            return "Buzz";
//        }else {
//            return str;
//        }
//    }

    public String fizzString(String str) {
        if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b'){
            return "FizzBuzz";
        }else if (str.charAt(0) == 'f'){
            return "Fizz";
        }else if (str.charAt(str.length() - 1) == 'b'){
            return "Buzz";
        }else {
            return str;
        }
    }

    /*
    CodeBat Solution:

public String fizzString(String str) {
  boolean f = str.startsWith("f");
  boolean b = str.endsWith("b");

  if (f && b) return "FizzBuzz";
  if (f) return "Fizz";
  if (b) return "Buzz";
  return str;

  // Style: you could use a series of "else" there, but it seems simpler
  // to just not have them.
}
     */

    public static void main(String[] args) {

        FizzString fizzString = new FizzString();

        System.out.println(fizzString.fizzString("fig"));
        System.out.println(fizzString.fizzString("gib"));
        System.out.println(fizzString.fizzString("fib"));
    }
}
