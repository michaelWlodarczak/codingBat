package map2.firstChar;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        String[] strings = {"hanna", "michal", "krzysztof", "agnieszka", "anna", "krystian", "martyna", "adam"};
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();

//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 1; j < strings.length; j++) {
//                if (strings[i].substring(0, 1).equals(strings[j].substring(0, 1))) {
//                    map.put(strings[i].substring(0, 1), strings[i].concat(strings[j]));
//                }
//            }
//        }
//        System.out.println(map);

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].substring(0, 1).equals(strings[j].substring(0, 1)))
                    map1.put(strings[i].substring(0, 1), strings[i] + strings[j]);
            }
        }
        System.out.println(map1);


    }
}
