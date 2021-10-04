package warmUp1.startOz;

public class Demo {
    public static void main(String[] args) {
        String str = "miha";

//        System.out.println(str.substring(0, 2));
//        System.out.println(str.substring(0, 1));
//        System.out.println(str.substring(1,2));


        if (str.length()>=2){
            if (str.substring(0,2).equals("oz")){
                System.out.println("oz");
            }else if (str.substring(0,1).equals("o")&&!str.substring(1,2).equals("z")){
                System.out.println("o");
            }else if (!str.substring(0,1).equals("o")&&str.substring(1,2).equals("z")){
                System.out.println("z");
            }
        }else {
            System.out.println("");
        }

    }
}
