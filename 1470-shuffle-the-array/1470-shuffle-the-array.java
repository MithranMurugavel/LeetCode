class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] num = new int[n+n];

        int sp=0,fp = n;
        int i=0;
       while(fp<num.length){
            num[i] = nums[sp++];
            num[i+1] = nums[fp++];
            i+=2;
        }

        return num;
    }
}