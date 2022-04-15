package string1;

/*
Given a string and a second "word" string,
we'll say that the word matches the string if it appears at the front of the string,
except its first char does not need to match exactly.
On a match, return the front of the string,
or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */
public class StartWord {
    public String startWord(String str, String word) {
        if(str.length()<word.length()){
            return "";
        }else if(str.length()==word.length() && str.equalsIgnoreCase(word)){
            return str;
        }else if(str.length()>=word.length() && str.substring(0,word.length()).equalsIgnoreCase(word)){
            return str.substring(0,word.length());
        }else if (str.length()>=word.length() && word.substring(1, word.length()).equals(str.substring(1, word.length()))){
            return str.substring(0, word.length());
        }else {
            return "";
        }
    }

    public static void main(String[] args) {

        StartWord startWord = new StartWord();

        System.out.println(startWord.startWord("hippo", "hi"));
        System.out.println(startWord.startWord("hippo", "xip"));
        System.out.println(startWord.startWord("h","a"));
        System.out.println(startWord.startWord("", "i"));
        System.out.println(startWord.startWord("hippo", "i"));
        System.out.println(startWord.startWord("hip", "zip"));

    }
}
