class Solution {
    public int[] sumZero(int n) {
        
        int[] arr=new int[n];

        int val=n/2;
        int l=0;
        int r=n-1;

        while(l<r){
            arr[l]=~val+1;
            arr[r]=val;
            l++;
            r--;
            val--;
        }
        return arr;
    }
}