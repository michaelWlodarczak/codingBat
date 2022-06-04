package map2;

import java.util.HashMap;
import java.util.Map;

/*
Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"

wordAppend([]) → ""
wordAppend(["a", "b", "b", "a", "a"]) → "ba"
wordAppend(["a", "b", "b", "b", "a", "c", "a", "a"]) → "baa"
wordAppend(["a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"]) → "baaba"
wordAppend(["not", "and", "or", "and", "this", "and", "or", "that", "not"]) → "andornot"
wordAppend(["a", "b", "c"]) → ""
wordAppend(["this", "or", "that", "and", "this", "and", "that"]) → "thisandthat"
 */
public class WordAppend {
//    public String wordAppend(String[] strings) {
//
//    }

    //TODO
    public static void main(String[] args) {

        String[]strings = {"a","b","c","d","e","a","g"};

        Map<String,Integer>map=new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if(!map.containsKey(strings[i])){
                map.put(strings[i],1);
            }else {
                map.put(strings[i],map.get(strings[i])+1);
            }
        }


        for (Integer v : map.values()){
            if (v>=2){
                System.out.println(map.keySet());
            }
        }

        


    }
}
