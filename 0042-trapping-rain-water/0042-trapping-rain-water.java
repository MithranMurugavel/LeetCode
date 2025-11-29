class Solution {
    public int trap(int[] height) {
        
        int l=0,r=height.length-1;

        int leftmax=height[0];
        int rightmax = height[r];

        int total = 0;

        while(l<r){

            if(height[l] < height[r]){
                leftmax = Math.max(leftmax,height[l]);
                if(leftmax-height[l] > 0){
                    total = total +(leftmax - height[l]);
                }
                l++;
            }

            else{
                rightmax = Math.max(rightmax,height[r]);
                if(rightmax - height[r] > 0){
                    total = total + (rightmax-height[r]);
                }
                r--;
            }
        }

        return total;
    }
}