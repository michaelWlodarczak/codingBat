package map2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, create and return a Map<String, String>
as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
public class Painrs {
    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0,1),
                    strings[i].substring(strings[i].length()-1,strings[i].length()));
        }
        return map;
    }

    public static void main(String[] args) {

        String[]strings1 = {"code","bug"};
        String[]strings2 = {"man","moon","main"};
        String[]strings3 = {"man","moon","good","night"};

        Painrs painrs = new Painrs();
        System.out.println(painrs.pairs(strings1));
        System.out.println(painrs.pairs(strings2));
        System.out.println(painrs.pairs(strings3));


    }
}
