package warmUp2.last2;

public class Demo1 {
    public static void main(String[] args) {
        String str = "erpathfinder";
        String end = str.substring(str.length() - 2, str.length());
        System.out.println(end + "\n");

        String any = str.substring(0,2);
        System.out.println(any + "\n");

        System.out.println(any.equals(end));


    }
}
