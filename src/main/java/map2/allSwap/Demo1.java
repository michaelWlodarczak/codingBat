package map2.allSwap;

public class Demo1 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int length = arr.length;
        int temp;
        for (int i = 0; i < length/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        for (int element:arr)
        {
            System.out.println (element);
        }
    }
}
