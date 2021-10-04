package warmUp1;

/*
Given a string, return a new string where "not " has been added to the front.
However, if the string already BEGINS(!!!) with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class NotString {
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static void main(String[] args) {
        NotString notString = new NotString();

        System.out.println(notString.notString("ass"));
        System.out.println(notString.notString("not bad"));
        System.out.println(notString.notString("is not"));
    }
}
