package warmUp2.stringX;

/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public class StringX {

    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1); // Could use str.charAt(i) here
            }
        }
        return result;
    }

/*
Moje rozwiazanie nie dalo rady



    public String stringX(String str) {
        String beg = str.substring(0,1);
        String end = str.substring(str.length() - 1, str.length());
        String empty = "";
        if (beg.equals("x") && end.equals("x")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("x")) {
                    empty = str.replace("x", "");
                }
            }
            return beg + empty + end;
        }else if (!beg.equals("x")||!end.equals("x")){
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i,i+1).equals("x")){
                    empty = str.replace("x","");
                    return empty;
                }
            }
        }
        return str;
    }
*/
    public static void main(String[] args) {
        StringX stringX = new StringX();

        System.out.println(stringX.stringX("xxHxix"));
        System.out.println(stringX.stringX("abxxxcd"));
        System.out.println(stringX.stringX("xabxxxcdx"));
        System.out.println(stringX.stringX("xmihax"));
        System.out.println(stringX.stringX("xx"));
        System.out.println(stringX.stringX("x"));
        System.out.println(stringX.stringX("Hello"));


    }
}
