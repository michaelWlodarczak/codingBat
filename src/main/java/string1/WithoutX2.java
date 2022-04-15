package string1;

/*
Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars,
and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
public class WithoutX2 {
    public String withoutX2(String str) {
        if((str.length()==0) || (str.length()==1 && str.equalsIgnoreCase("x"))
                || (str.length()==2 && str.equalsIgnoreCase("xx"))) {
            return "";
        }else if(str.length()>2 && str.substring(0,2).equalsIgnoreCase("xx")){
            return str.substring(2, str.length());
        }else if(str.length()>2 && str.substring(1,2).equalsIgnoreCase("x")){
            return (str.substring(0, 1) + str.substring(2, str.length()));
        }else if (str.length()>2 && str.substring(0,1).equalsIgnoreCase("x")) {
            return str.substring(1, str.length());
        }else {
            return str;
        }
    }

    public static void main(String[] args) {

        WithoutX2 withoutX2 = new WithoutX2();

        System.out.println(withoutX2.withoutX2("xHi"));
        System.out.println(withoutX2.withoutX2("HXi"));
        System.out.println(withoutX2.withoutX2(""));
        System.out.println(withoutX2.withoutX2("X"));
        System.out.println(withoutX2.withoutX2("Hi"));


    }
}
