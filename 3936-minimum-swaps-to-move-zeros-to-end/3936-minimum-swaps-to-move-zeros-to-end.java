class Solution {
    public int minimumSwaps(int[] nums) {
        int count = 0;

        for(int n:nums){
            if(n == 0) count++;
        }
        int n = nums.length;
        int r = 0;
        for(int i = 0;i<n-count;i++){
            if(nums[i] == 0){
                r++;
            }
        }

        return r;
    }
}