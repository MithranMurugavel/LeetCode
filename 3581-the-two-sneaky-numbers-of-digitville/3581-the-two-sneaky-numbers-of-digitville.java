class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int[] arr = new int[nums.length];

        int[] val= new int[2];

        for(int i:nums){
            arr[i]++;
        }
        int p=0;
        for(int i=0;i<nums.length;i++){
                if(arr[i] > 1 && p<2){
                    val[p++]=i;
                }
        }

        return val;
    }
}