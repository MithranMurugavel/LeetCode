class Solution {
    public int maxSum(int[] nums) {
         boolean allNegative = true;
        int maxValue = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n >= 0) {
                allNegative = false;
            }
            if (n > maxValue) {
                maxValue = n;
            }
        }
        if (allNegative)
            return maxValue;
        Set<Integer> set =new HashSet<>();

        for(int n:nums){
            if(n>0)
            set.add(n);
        }

        int sum=0;

        for(int n:set){
            sum+=n;
        }
        return sum;
    }
}