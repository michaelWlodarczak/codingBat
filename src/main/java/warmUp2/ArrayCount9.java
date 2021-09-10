package warmUp2;

/*
Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==9){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 6, 5, 8,9,9,0,9};

        ArrayCount9 arrayCount9 = new ArrayCount9();

        System.out.println(arrayCount9.arrayCount9(nums));

    }

}
