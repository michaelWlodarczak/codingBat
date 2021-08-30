package warmUp1;

/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

//TODO
public class StartOz {
    public String startOz(String str) {
        return str;
    }


    public static void main(String[] args) {
        StartOz startOz = new StartOz();

//        String ozmiha = "ozmiha";
//        String oz = ozmiha.substring(0,2);
//        String o = oz.substring(0,1);
//        String z = oz.substring(1,2);
//        System.out.println(oz);
//        System.out.println(o);
//        System.out.println(z);


        System.out.println(startOz.startOz("ozmandias")); //oz
        System.out.println(startOz.startOz("bzoo")); //z
        System.out.println(startOz.startOz("oxx")); //o
        System.out.println(startOz.startOz("oz"));  //oz
        System.out.println(startOz.startOz("ounce")); //o
        System.out.println(startOz.startOz("o")); //o
        System.out.println(startOz.startOz("abc")); //
        System.out.println(startOz.startOz(""));  //
        System.out.println(startOz.startOz("zoo")); //
        System.out.println(startOz.startOz("aztec"));  //z
        System.out.println(startOz.startOz("zzzz"));  //z
        System.out.println(startOz.startOz("oznic"));  //oz


    }
}
