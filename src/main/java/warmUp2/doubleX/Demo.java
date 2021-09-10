package warmUp2.doubleX;

public class Demo {
    public static void main(String[] args) {
        String str = "mxxha";
        String x = "x";
        String xx = "xx";
        System.out.println(str.contains("xx"));


//        String xstr = str.substring(1,2);
//          String xxstr = str.substring(1,3);
//        System.out.println(x);
//        System.out.println(xstr);
//          System.out.println(xxstr);
//        System.out.println(x.equals(xstr));

        for (int i = 0; i < str.length(); i++) {
            String xstr = str.substring(i,i+1);
            if (x.equals(xstr)){
                System.out.println("tak");
            }else {
                System.out.println("nie");
            }
        }

//        for (int i = 0; i < str.length(); i++) {    <=== StringOutOfBoundException
//            String xstr = str.substring(i,i+1);
//            String xxstr = str.substring(i+1,i+2);
//            if (x.equals(xstr) && x.equals(xxstr)){
//                System.out.println("tak");
//            }else {
//                System.out.println("nie");
//            }
//        }



    }
}
