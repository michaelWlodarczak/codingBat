package warmUp1.endUp;

public class Demo {
    public static void main(String[] args) {
//        String p = "pathfinder";
//        System.out.println(p.length());
//        System.out.println(p.toUpperCase().charAt(0));
//        System.out.println();
//        System.out.println(p.charAt(p.length() - 3));
//        System.out.println(p.charAt(7));
//        System.out.println("---------------------");
//        System.out.println(p.charAt(p.length() - 2));
//        System.out.println(p.charAt(8));
//        System.out.println("---------------------");
//        System.out.println(p.charAt(p.length() - 1));
//        System.out.println(p.charAt(9));
//        System.out.println("------------------------");
//        System.out.println(p.toUpperCase());
//        System.out.println(p.substring(7, 10).toUpperCase());
//        System.out.println(p.substring(p.length() - 3, p.length()).toUpperCase());


        String p = "abc";
        if (p.length() <= 3) {
            System.out.println(p.toUpperCase());
        } else {
            String beg = p.substring(0, p.length() - 3);
            String end = p.substring(p.length() - 3, p.length()).toUpperCase();
            System.out.println(beg + end);


        }
    }
}
