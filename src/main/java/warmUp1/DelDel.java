package warmUp1;

/*
Given a string, if the string "del" appears starting at index 1,
return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class DelDel {
    public String delDel(String str) {
        if (str.length() >= 4) {
            String first = str.substring(0,1);
            String del = str.substring(1, 4);
            String rest = str.substring(4,str.length());
            if (del.equals("del")){
                return first+rest;
            }else {
                return str;
            }
        }return str;
    }

    /*
    Solution:
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str;
}
     */

    public static void main(String[] args) {
        DelDel delDel = new DelDel();

        System.out.println(delDel.delDel("adel"));
        System.out.println(delDel.delDel("adelHello"));
        System.out.println(delDel.delDel("abcd"));
        System.out.println(delDel.delDel("del"));
        System.out.println(delDel.delDel("H"));

//        String str = "mihapathfinderone";
//        System.out.println(str.length());
//        String del = str.substring(1,4);
//        String first = str.substring(0,1);
//        String rest = str.substring(4,str.length());
//        System.out.println(str);
//        System.out.println(del);
//        System.out.println(first);
//        System.out.println(rest);
//        System.out.println(first+rest);
    }
}
