package array1;

import java.util.Arrays;

/*
Given an array of ints of even length,
return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */
public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int[]arr={nums[(nums.length/2)-1],nums[nums.length/2]};
        return arr;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,3,4};

        System.out.println("lenght: " + nums.length);
        System.out.println("lenght/2: " + nums.length/2);

        System.out.println(nums[(nums.length/2)-1]);
        System.out.println(nums[nums.length / 2]);
        int[]arr={nums[(nums.length/2)-1],nums[nums.length/2]};
        System.out.println("num: " + Arrays.toString(nums));
        System.out.println("arr: " + Arrays.toString(arr));

    }
}
