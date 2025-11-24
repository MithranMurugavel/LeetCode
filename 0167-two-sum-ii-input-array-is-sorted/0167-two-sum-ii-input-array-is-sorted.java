class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l = 0;
        int r = numbers.length-1;

        while(l<r){

            int val = numbers[l]+numbers[r];
            if(val == target){
                return new int[]{l+1,r+1};
            }
            
            if(val>target){
                r--;
            }
            if(val<target){
                l++;
            }
        }

        return new int[]{-1,-1};
    }
}