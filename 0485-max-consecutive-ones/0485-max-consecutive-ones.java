class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int count=0;
        int l=0,r = 0;

        while(r<nums.length){

            if(nums[r] == 1){
                count++;
            }
            else{
                max = Math.max(max,count);
                count=0;
            }
            r++;
        }
        max = Math.max(max,count);
        return max;
    }
}