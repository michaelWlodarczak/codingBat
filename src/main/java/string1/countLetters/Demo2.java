package string1.countLetters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {

        List<Map.Entry<Character, Integer>> listMap = new ArrayList<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a',1);
        hashMap.put('b',2);
        hashMap.put('c',3);
        hashMap.put('d',4);
        System.out.println(hashMap);


        listMap.add(1, (Map.Entry<Character, Integer>) new HashMap<Character, Integer>(hashMap));
        System.out.println(listMap);


    }
}
