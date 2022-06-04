package map2;

/*
Given an array of strings, return a Map<String, Boolean>
where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class WordMultiple_INTERESTING {
        public Map<String, Boolean> wordMultiple(String[] strings) {
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Boolean> map2 = new HashMap<>();
            for (int i = 0; i < strings.length; i++) {
                if (!map1.containsKey(strings[i])) {
                    map1.put(strings[i], 1);
                } else {
                    map1.put(strings[i], map1.get(strings[i]) + 1);
                }
            }
            for (int i = 0; i < strings.length; i++) {
                map2.put(strings[i],!map1.get(strings[i]).equals(1));
            }
            return map2;
    }
    public static void main(String[] args) {

        String[] strings = {"a", "b", "a", "c", "b", "d", "d", "d"};

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map1.containsKey(strings[i])) {
                map1.put(strings[i], 1);
            } else {
                map1.put(strings[i], map1.get(strings[i]) + 1);
            }
        }
        System.out.println(map1);


        for (Integer v : map1.values()) {
            System.out.println(v.equals(1));
            }

        for (int i = 0; i < strings.length; i++) {
            map2.put(strings[i],!map1.get(strings[i]).equals(1));
        }
        System.out.println(map2);




    }
}


