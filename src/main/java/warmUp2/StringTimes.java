package warmUp2;

/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class StringTimes {
    public String stringTimes(String str, int n) {
        String empty = "";
        for (int i = 0; i < n; i++) {
            empty = empty+str;
        }
        return empty;
    }

    public static void main(String[] args) {
        StringTimes stringTimes = new StringTimes();

        System.out.println(stringTimes.stringTimes("Hi", 2));
        System.out.println(stringTimes.stringTimes("Hi", 3));
        System.out.println(stringTimes.stringTimes("DUpa", 4));


        String str = "Hi";
        int n = 3;

        String empty = "";
        for (int i = 0; i < n; i++) {
            empty = empty+str;
        }
        System.out.println(empty);

    }
}
