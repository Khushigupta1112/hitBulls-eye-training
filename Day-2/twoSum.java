public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,4,6,2,5,7};
        int target = 7;
        for(int i =0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++ ){
                if(nums[i] + nums[i+1]== target){
                System.out.println(i);
                }
            }

        }

    }

    
}
