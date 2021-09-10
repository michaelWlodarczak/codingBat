package warmUp2.stringYak;

public class Demo {
    public static void main(String[] args) {
        String str = "kayakzz";
        String yak = "yak";
//        System.out.println(str.substring(0, 3));
        //System.out.println(str.substring(i, i + 3));


        String empty = "";
        for (int i = 0; i < str.length() - 2; i++) {
            String result = "";
            if (str.substring(i, i + 3).equals(yak)) {
                empty += str.substring(i, i + 3);
                result = str.replace(yak, "");
            }
            System.out.println(result);
        }
        System.out.println(empty);


    }
}
