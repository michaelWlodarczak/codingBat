package string1;

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars,
so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
public class ConCat {
    public String conCat(String a, String b) {
        if(a.length()==0 || b.length()==0){
            return a+b;
        }else if(a.substring(a.length()-1,a.length()).equals(b.substring(0,1))){
            return a.substring(0,a.length()-1)+b;
        }
        return a+b;
    }

    public static void main(String[] args) {
        ConCat conCat = new ConCat();

        System.out.println(conCat.conCat("abc","cat"));
        System.out.println(conCat.conCat("dog","cat"));
        System.out.println(conCat.conCat("abc",""));
        System.out.println(conCat.conCat("",""));
        System.out.println(conCat.conCat("","efg"));

    }
}
