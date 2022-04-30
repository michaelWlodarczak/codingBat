package string1.countLetters;

/*
Code Part: Please create a simple program that consumes one string as an application argument.
Program should count the number of each letter in the string
and present the results to the console. Sample output:

c:\java MyApp JavaAcademy

Counted letters:
m = 2
y = 2
a = 5
p = 2
j = 1
v = 1
c = 1
d = 1

So the argument is “JavaAcademy”.

Additionally it would be nice if the results are sorted alphabetically.
Really nice if Maven and Git are used.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountLetters {

    public static List countLetters(String str) {

        //removing all white spaces characters and making input string to lower case
        String strLowerCase = str.replaceAll(" ", "").trim().toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        //converting input to array of chars
        char[] strArray = strLowerCase.toCharArray();

        //iterating through strArray and putting chars into Map
        for (char c : strArray) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        //print key and value without sorting
        //for (Map.Entry entry : hashMap.entrySet()){
        //System.out.println(entry.getKey() + " = " + entry.getValue());
        //}

        //sorting values from map alphabetically and returning as a list
        List<Map.Entry<Character, Integer>> result =
                hashMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());

        return result;
    }
}
