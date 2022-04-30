package map1.mapBully;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a","andy");
        map.put("b","brandy");
        map.put("c","candy");

                for (Map.Entry x : map.entrySet()){
            System.out.println(x);
        }
        for (String k : map.keySet()){
            System.out.println(k);
        }
        for (String v : map.values()){
            System.out.println(v);
        }

        map.entrySet()
                .forEach((e)->System.out.println(e.getKey() + " : " + e.getValue()));

    }
}
