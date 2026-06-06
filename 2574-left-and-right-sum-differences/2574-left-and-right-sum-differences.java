class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        if(n == 1) return new int[]{0};
        int[] right = new int[n];
        int[] left = new int[n];
        int[] result = new int[n];
        int sum = 0;
        for(int i = 1;i<n;i++){
            left[i] = nums[i-1]+sum;
            sum = left[i];
        }
        sum = 0;
        for(int i = n-2;i>=0;i--){
            right[i] = nums[i+1]+sum;
            sum = right[i];
        }

        for(int i =0;i<n;i++){
            result[i] = Math.abs(left[i] - right[i]);
        }
        return result;
    }
}