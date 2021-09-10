package warmUp2.array123;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123 {
    public boolean array123(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length-2; i++) {
            int[] jdt = {1, 2, 3};
            if (nums[i] == jdt[0] && nums[i + 1] == jdt[1] && nums[i + 2] == jdt[2]) {
                return true;
            }
        }
        return false;
    }

    /*
    Solution:
public boolean array123(int[] nums) {
  // Note: iterate < length-2, so can use i+1 and i+2 in the loop
  for (int i=0; i < (nums.length-2); i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}
     */

    public static void main(String[] args) {
        Array123 array123 = new Array123();

        int[] nums = {9,13,45,1,2,3,5,7,9};
        System.out.println(array123.array123(nums));


    }


}



