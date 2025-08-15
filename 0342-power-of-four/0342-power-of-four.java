class Solution {
    public boolean isPowerOfFour(int n) {
        
        long val=1;
        while(n>val){

            val=val<<2;
        }

        if(val==n)return true;
        return false;
    }
}