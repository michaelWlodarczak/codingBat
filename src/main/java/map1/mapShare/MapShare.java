package map1.mapShare;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
    if(map.containsKey("a")){
        map.remove("c");
        map.put("b",map.get("a"));
    }
        return map;
    }

    public static void main(String[] args) {

        MapShare mapShare = new MapShare();
        Map<String,String> map = new HashMap<>();

        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        map.put("d","ddd");

        System.out.println(mapShare.mapShare(map));


//        System.out.println(map.entrySet());
    }

}
