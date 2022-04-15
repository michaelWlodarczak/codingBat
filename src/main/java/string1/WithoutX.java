package string1;

/*
Given a string, if the first or last chars are 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
public class WithoutX {
    public String withoutX(String str) {
        if((str.length()==0) || (str.length()==1 && str.equals("x"))){
            return "";
        }else if (str.substring(0,1).equalsIgnoreCase("x") &&
                str.substring(str.length()-1,str.length()).equalsIgnoreCase("x")){
            return str.substring(1, str.length() - 1);
        }else if (str.substring(0,1).equalsIgnoreCase("x")){
            return str.substring(1, str.length());
        }else if(str.substring(str.length()-1,str.length()).equalsIgnoreCase("x")){
            return str.substring(0, str.length() - 1);
        }else {
            return str;
        }
    }

    public static void main(String[] args) {

        WithoutX withoutX = new WithoutX();

        System.out.println(withoutX.withoutX("xHiX"));
        System.out.println(withoutX.withoutX("HiX"));
        System.out.println(withoutX.withoutX(""));
        System.out.println(withoutX.withoutX("xHi"));

    }
}
