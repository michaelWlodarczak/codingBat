package warmUp2.last2;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hi";
        String end = str.substring(str.length() - 2, str.length());
        System.out.println(end + "\n");

//        String any = str.substring(0,2);
//        System.out.println(any + "\n");

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String any = str.substring(i, i + 2);
            if (end.equals(any)) {
                count++;
            }
        }
        System.out.println(count-1);

    }
}

