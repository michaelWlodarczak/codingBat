package warmUp1;

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */


public class StringE {
    public boolean stringE(String str) {
        int counter = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') counter++;
            // alternately: str.substring(i, i+1).equals("e")
        }
        return (counter >= 1 && counter <= 3);
    }

    public static void main(String[] args) {
        StringE stringE = new StringE();

        System.out.println(stringE.stringE("Hello"));
        System.out.println(stringE.stringE("Heelle"));
        System.out.println(stringE.stringE("Heelele"));
    }

}
