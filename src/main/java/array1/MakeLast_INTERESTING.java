package array1;

import java.util.Arrays;

/*
Given an int array, return a new array with double
the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */
public class MakeLast_INTERESTING {
    public int[] makeLast(int[] nums) {
        int[] arr = new int[(nums.length * 2) - 1];
        int n = arr.length;
        int[] resultArr = new int[n + 1];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        resultArr[resultArr.length - 1] = nums[nums.length - 1];
        return resultArr;
    }

//      Other solution
//    public int[] makeLast(int[] nums) {
//        // Make a new result array with double the length
//        int[] res = new int[nums.length * 2];
//
//        // Copy over the last element
//        res[res.length - 1] = nums[nums.length - 1];
//        return res;
//    }

    public static void main(String[] args) {
        int[] nums = {1,5,6,7,8};

        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        int[] arr = new int[(nums.length * 2) - 1];
        int n = arr.length;

        System.out.println(arr.length);
        System.out.println(n);
        System.out.println(Arrays.toString(arr));

        int[] resultArr = new int[n + 1];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];

        resultArr[resultArr.length - 1] = nums[nums.length - 1];

        System.out.println(Arrays.toString(resultArr));

    }
}
