package warmUp2.altPairs;

public class Demo {
    public static void main(String[] args) {
        String str = "CodingHorror";

//        String basicPrint = str.substring(0, 0 + 2);
//        String basicRemove = str.substring(0 + 2, 0 + 4);



        String alt = "";
        String empty = "";
        for (int i = 0; i < str.length()-1; i++) {
            alt +=str.substring(i,i+1);
            empty+=str.substring(i+1,i+2);
        }
        System.out.println(alt+empty);
    }
}
