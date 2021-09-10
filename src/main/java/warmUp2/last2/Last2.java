package warmUp2.last2;

/*
Given a string, return the count of the number of times
that a substring length 2 appears in the string and also
as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

Mając dany ciąg, zwróć liczbę wystąpień podciągu o długości 2 w ciągu,
a także jako ostatnie 2 znaki ciągu, więc „hixxxhi” daje 1
(nie będziemy liczyć końcowego podciągu).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

public class Last2 {
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.length() >= 2) {
            int count = 0;
            String end = str.substring(str.length() - 2, str.length());
            for (int i = 0; i < str.length() - 1; i++) {
                String any = str.substring(i, i + 2);
                if (end.equals(any)) {
                    count++;
                }
            }
            return count-1;
        }
        return 0;
    }

    /*
    Solution:
public int last2(String str) {
  // Screen out too-short string case.
  if (str.length() < 2) return 0;

  String end = str.substring(str.length()-2);
  // Note: substring() with 1 value goes through the end of the string
  int count = 0;

  // Check each substring length 2 starting at i
  for (int i=0; i<str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    if (sub.equals(end)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}
     */

                public static void main (String[]args){
                    Last2 last2 = new Last2();

                    System.out.println(last2.last2("HiHi"));
                    System.out.println(last2.last2("hixxhi"));
                    System.out.println(last2.last2("xaxxaxaxx"));
                    System.out.println(last2.last2("axxxaaxx"));
                }
            }
