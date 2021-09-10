package warmUp2;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
public class AltPairs {
    public String altPairs(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            String part = str.substring(i, i + 2);
            i = i + 3;
            return part;
        }
        return str;
    }

    public static void main(String[] args) {
        AltPairs altPairs = new AltPairs();

        System.out.println(altPairs.altPairs("CodingHorror"));
        String str = "CodingHorror";

        //TODO - dokonczyc
//        String fst = str.substring(0, 2);
//        System.out.println(fst);
//        String scnd = str.substring(4, 6);
//        System.out.println(scnd);
//        String trd =str.substring(8,10);
//        System.out.println(trd);

        for (int i = 0; i < str.length() - 1; i++) {
            String part = str.substring(i, i + 2);
            i = i + 3;
            System.out.println(part);
        }
    }
}
