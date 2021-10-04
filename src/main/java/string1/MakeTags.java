package string1;

/*

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class MakeTags {
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public static void main(String[] args) {
        MakeTags makeTags = new MakeTags();

        System.out.println(makeTags.makeTags("i", "Yay"));
        System.out.println(makeTags.makeTags("i", "Hello"));
        System.out.println(makeTags.makeTags("cite", "Yay"));
    }

}
