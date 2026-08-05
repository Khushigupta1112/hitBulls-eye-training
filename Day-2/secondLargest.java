public class secondLargest {
    static int secondlarge(int[] nums ) {
        int largest = nums[0];
        int second_largest = nums[1];
        for(int i = 0;i<nums.length; i++){
            if(nums[i] > largest){
                second_largest = largest;
                largest = nums[i];
            }
        }
        return largest;

    }
    public static void main(String[] args){
        int[] nums = {2,3,1,7,4,5};
        int ans = secondlarge(nums);
        
    
        
    }

    
}
