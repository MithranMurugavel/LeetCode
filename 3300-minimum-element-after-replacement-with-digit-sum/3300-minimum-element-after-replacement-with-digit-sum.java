class Solution {
    private static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        
        int i = 0;
        int j = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(i <= j){

            int n1 = digitSum(nums[i]);
            int n2 = digitSum(nums[j]);

            min = Math.min(n1,Math.min(n2,min));
            i++;
            j--;
        }

        return min;
    }
}