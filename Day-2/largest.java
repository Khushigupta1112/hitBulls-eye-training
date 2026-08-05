public class largest {
     static int large(int[] nums) {
        // int largest = Integer.MIN_VALUE;
        // int[] nums = {-1,-4,-5,-2,-9,-6};
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] > largest){
        //         largest = nums[i];
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {-1,-4,5,2,-9,-6};
        int ans = large(nums);
        System.out.println(ans);
        
    }}