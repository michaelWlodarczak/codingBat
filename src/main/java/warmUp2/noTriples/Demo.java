package warmUp2.noTriples;

public class Demo {
    public static void main(String[] args) {
        int [] nums = {1,2,7,7,7,4,5};

        System.out.println(nums[2] == nums[3]);

        int counter = 0;
        int triple = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                counter++;
                triple = nums[i];
            }
        }
        System.out.println(counter);
        System.out.println(triple);



    }
}
