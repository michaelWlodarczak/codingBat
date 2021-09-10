package warmUp2.doubleX;

public class Demo2 {
    public static void main(String[] args) {
        String str = "mihax";

        System.out.println(str.indexOf('x'));
//        String xx = str.substring(str.indexOf('x') + 1,str.indexOf('x')+2);
//        System.out.println(xx);
//        System.out.println("x equals to xx_substring: " + "x".equals(xx));
//        System.out.println("lenght: " + str.length());
        System.out.println(str.charAt(str.length()-1));

        int a = str.indexOf('x');
        int b = (str.length()-1);
        System.out.println(a==b);

    }
}
