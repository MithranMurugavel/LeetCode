class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length == 1) return 0;
        int min = Integer.MIN_VALUE;

        int i = 0;

        while(i<nums.length){

            int prev = i-1 >= 0 ? nums[i-1] : min;
            int next = i+1 < nums.length ? nums[i+1] : min;

            if(nums[i]>=prev && nums[i]>=next){
                return i;
            }
            i++;
        }

        return -1;
    }
}