package warmUp2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public class StringBits {
    public String stringBits(String str) {
        String empty = "";
        for (int i = 0; i < str.length(); i++) {
            if (i%2==0){
                empty += str.charAt(i);
            }
        }
        return empty;
    }

    /*
    Solution:
public String stringBits(String str) {
  String result = "";
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;
}
     */

    public static void main(String[] args) {
        StringBits stringBits = new StringBits();

        System.out.println(stringBits.stringBits("Hello"));
        System.out.println(stringBits.stringBits("Hi"));
        System.out.println(stringBits.stringBits("Heeololeo"));

        String str = "Hi";

        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                System.out.println(str.charAt(i));
            }
        }

    }
}
