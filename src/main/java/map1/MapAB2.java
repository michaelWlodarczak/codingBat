package map1;

/*
Modify and return the given map as follows:
if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b") &&
                map.get("a").equals(map.get("b"))){
            map.remove("a",map.get("a"));
            map.remove("b",map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {

        MapAB2 mapAB2 = new MapAB2();
        Map<String,String> map = new HashMap<>();

        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        map.put("d","ddd");

        System.out.println(mapAB2.mapAB2(map));


    }
}
