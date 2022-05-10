package array1;

import java.util.Arrays;

/*
Given an array of ints of odd length,
return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */
public class MidThree {
    public int[] midThree(int[] nums) {
        int[]arr = {nums[(nums.length/2)-1],nums[nums.length / 2],nums[(nums.length/2)+1]};
        return arr;
    }

    public static void main(String[] args) {

        int[]nums = {1, 2, 3};

        System.out.println("lenght: " + nums.length);
        System.out.println("lenght/2: " + nums.length/2);

        System.out.println(nums[(nums.length/2)-1]);
        System.out.println(nums[nums.length / 2]);
        System.out.println(nums[(nums.length/2)+1]);

        int[]arr = {nums[(nums.length/2)-1],nums[nums.length / 2],nums[(nums.length/2)+1]};
        System.out.println(Arrays.toString(arr));

    }
}
