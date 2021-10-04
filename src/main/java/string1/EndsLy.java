package string1;

/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() >= 2) {
            if (str.substring(str.length() - 2, str.length()).equals("ly")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EndsLy endsLy = new EndsLy();

        System.out.println(endsLy.endsLy("oddly"));
        System.out.println(endsLy.endsLy("y"));
        System.out.println(endsLy.endsLy("oddy"));
        System.out.println(endsLy.endsLy("ly"));
        System.out.println(endsLy.endsLy(""));
    }
}
