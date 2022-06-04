package map2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, return a Map<String, String>
with a key for every different first character seen,
with the value of all the strings starting with that character
appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
firstChar(["apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"])
→ {"a": "appleaardvark", "b": "bellsbellsbells", "s": "saltsun", "z": "zen"}
 */

//TODO
public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String,String>map=new HashMap<>();
        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].substring(0, 1).equals(strings[j].substring(0, 1))){
                    map.put(strings[i].substring(0,1),strings[i]+strings[j]);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {

        String[]strings = {"salt","tea","soda","toast"};
        String[]strings1 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[]strings2 = {};
        String[]strings3 = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"};


        Map<String,String>map=new HashMap<>();

//        for (int i = 0; i < strings.length; i++) {
//            map.put(strings[i].substring(0,1),strings[i]);
//        }
//        System.out.println(map);

        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].substring(0, 1).equals(strings[j].substring(0, 1))){
                    map.put(strings[i].substring(0,1),strings[i]+strings[j]);
                }
            }
        }
        System.out.println(map);

        FirstChar firstChar = new FirstChar();
        System.out.println(firstChar.firstChar(strings));
        System.out.println(firstChar.firstChar(strings1));
        System.out.println(firstChar.firstChar(strings2));
        System.out.println(firstChar.firstChar(strings3));


    }
}
