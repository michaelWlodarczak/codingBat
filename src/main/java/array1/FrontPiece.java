package array1;

import java.util.Arrays;

/*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */
public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            int[] arr = {nums[0], nums[1]};
            return arr;
        } else {
            return nums;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        if (nums.length >= 2) {
            int[] arr = {nums[0], nums[1]};
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println(Arrays.toString(nums));
        }
    }
}
