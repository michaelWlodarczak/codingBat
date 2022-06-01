package map2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Integer>
containing a key for every different string in the array, and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class WordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i],strings[i].length());
        }
        return map;
    }

    public static void main(String[] args) {
        String[]strings1 = {"a","bb","a","bb"};
        String[]strings2 = {"this","and","that","and"};
        String[]strings3 = {"code","bug","code","code"};

        WordLen wordLen = new WordLen();
        System.out.println(wordLen.wordLen(strings1));
        System.out.println(wordLen.wordLen(strings2));
        System.out.println(wordLen.wordLen(strings3));


    }
}
