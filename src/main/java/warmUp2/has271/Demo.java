package warmUp2.has271;

public class Demo {
    public static void main(String[] args) {

        int[] nums = {2, 7, 1};

        for (
                int i = 0;
                i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 5 && nums[i + 2] == nums[i] - 1) {
                System.out.println("tak");
            }
        }

    }
}
