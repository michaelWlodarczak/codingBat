package string1.countLetters;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        String str = "JavaAcademy";
        String strLowerCase = str.replaceAll(" ", "").trim().toLowerCase();
        System.out.println(strLowerCase);

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] strArray = strLowerCase.toCharArray();

        for (char c : strArray) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        List<Map.Entry<Character, Integer>> result =
                hashMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());

        System.out.println(result);

    }
}
