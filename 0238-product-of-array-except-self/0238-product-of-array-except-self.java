class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];

        for(int i=0;i<n;i++){
            
            if(i==0){
                pre[i]=1;
            }
            else{
                pre[i] = nums[i-1] * pre[i-1];
            }
        }
        for(int i=n-1;i>=0;i--){
            
            if(i==n-1){
                post[i]=1;
            }
            else{
                post[i] = nums[i+1] * post[i+1];
            }
        }

        for(int i=0;i<n;i++){
            pre[i]=pre[i]*post[i];
        }

        return pre;
    }
}