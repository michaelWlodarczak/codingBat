package map1;

/*
Modify and return the given map as follows:
if exactly one of the keys "a" or "b" has a value in the map (but not both),
set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b"))
            return map;
        if(map.containsKey("a")) map.put("b",map.get("a"));
        if(map.containsKey("b")) map.put("a",map.get("b"));
        return map;
    }

    public static void main(String[] args) {

        MapAB3 mapAB3 = new MapAB3();
        Map<String,String> map = new HashMap<>();

        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        map.put("d","ddd");

        System.out.println(mapAB3.mapAB3(map));


    }
}
