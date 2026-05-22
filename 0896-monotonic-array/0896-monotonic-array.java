class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<nums.length-1;i++){

            if(nums[i] < nums[i+1]){
                count1 = 1;
            }

            if(nums[i] > nums[i+1]){
                count2 = 1;
            }

            if(count1 == 1 && count2 == 1){
                return false;
            }
        }

        return true;
    }
}