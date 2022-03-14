package string1;

/*
Given a string, if the string begins with "red" or "blue" return that color string,
otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */

public class SeeColor {
    public String seeColor(String str) {
        String red = "red";
        String blue = "blue";

        if(str.length()<3){
            return "";
        }else if(str.length() == 3 && str.equals(red)) {
            return red;
        }else if(str.length() == 4 && str.equals(blue)){
            return blue;
        }else if (str.length()>3 && str.substring(0,3).equals(red)) {
            return red;
        }else if (str.length()>4 && str.substring(0,4).equals(blue)){
            return blue;
        }else {
            return "";
        }
    }

    public static void main(String[] args) {
        SeeColor seeColor = new SeeColor();

        System.out.println(seeColor.seeColor("redxx"));
        System.out.println(seeColor.seeColor("xxred"));
        System.out.println(seeColor.seeColor("blueTimes"));
        System.out.println(seeColor.seeColor("NoColor"));
        System.out.println(seeColor.seeColor("red"));
        System.out.println(seeColor.seeColor("re"));
        System.out.println(seeColor.seeColor("blu"));
        System.out.println(seeColor.seeColor("blue"));
        System.out.println(seeColor.seeColor("a"));
        System.out.println(seeColor.seeColor(""));
        System.out.println(seeColor.seeColor("xyzred"));
    }
}
