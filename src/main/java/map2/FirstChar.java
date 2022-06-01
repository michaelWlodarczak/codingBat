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
 */
public class FirstChar {
//    public Map<String, String> firstChar(String[] strings) {
//
//    }

    public static void main(String[] args) {

        String[]strings = {"salt","tea","soda","toast"};
        Map<String,String>map=new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0,1),"");
        }
        System.out.println(map);

    }

}
