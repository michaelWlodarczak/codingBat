package warmUp2.array123;

public class Demo {
    public static void main(String[] args) {



        int[] nums = {9, 1, 2, 3, 4, 15};
        System.out.println(nums.length);
//        int[] jdt = {1, 2, 3};
//        System.out.println(nums[0] == jdt[0]);


        for (int i = 0; i < nums.length; i++) {
            int[] jdt = {1, 2, 3};
            if (nums[i] == jdt[0] && nums[i + 1] == jdt[1] && nums[i + 2] == jdt[2]) {
                System.out.println("tak");
            } else {
                System.out.println("nie");
            }
        }
    }
}
