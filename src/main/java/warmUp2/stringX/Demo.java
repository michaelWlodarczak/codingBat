package warmUp2.stringX;

public class Demo {
    public static void main(String[] args) {

        String str = "xaax";
        System.out.println(str.length());
        String beg = str.substring(0,1);
        String end = str.substring(str.length() - 1, str.length());

        System.out.println(beg);
        System.out.println(end);

        String empty = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals("x")){
//                empty = str.substring(i,i+1).replace("x","");
                empty = str.replace("x","");
            }
        }
        System.out.println(empty);
    }
}
