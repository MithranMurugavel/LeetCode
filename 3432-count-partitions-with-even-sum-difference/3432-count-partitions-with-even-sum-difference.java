class Solution {
    public int countPartitions(int[] nums) {
        
        int count = 0;
        int sum = 0;

        for(int n:nums){
            sum+=n;
        }
        for(int i=0;i<nums.length;i++){
            int val=sum;
            int temp = 0;

            for(int j=0;j<=i;j++){
                val -=nums[j];
                temp += nums[j];
            }
            int n = Math.abs(val - temp);

            if(n%2 == 0) count++;
        }

        return count==0 ? 0 : count-1;
    }
}