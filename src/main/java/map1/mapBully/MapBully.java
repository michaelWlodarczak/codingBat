package map1.mapBully;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "". Basically "b" is a bully,
taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {

        MapBully mapBully = new MapBully();
        Map<String,String> map = new HashMap<>();
        map.put("d","delta");
        map.put("e","echo");
        map.put("a","alpha");
        map.put("c","charlie");
        map.put("b","bravo");

        System.out.println(mapBully.mapBully(map));

    }
}
