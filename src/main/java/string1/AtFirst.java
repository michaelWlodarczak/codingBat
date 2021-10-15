package string1;

/*
Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */
public class AtFirst {
    public String atFirst(String str) {
        if(str.length()>=2){
            return str.substring(0,2);
        }else if(str.length()>=1){
            return str.substring(0,1)+"@";
        }
        return "@@";
    }

    public static void main(String[] args) {
        AtFirst atFirst = new AtFirst();

        System.out.println(atFirst.atFirst("hello"));
        System.out.println(atFirst.atFirst("hi"));
        System.out.println(atFirst.atFirst("h"));
        System.out.println(atFirst.atFirst(""));
        System.out.println(atFirst.atFirst("dupsko"));

    }


}
