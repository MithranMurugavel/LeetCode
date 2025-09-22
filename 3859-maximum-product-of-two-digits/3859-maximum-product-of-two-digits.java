class Solution {
    public int maxProduct(int n) {
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        while(n>0){

            int r = n%10;

            if(max1 < r){
                int temp = max1;
                max1 = r;
                max2 = temp;
            }
            else if(r>max2) max2=r;
            n/=10;
        }

        return max1*max2;
    }
}