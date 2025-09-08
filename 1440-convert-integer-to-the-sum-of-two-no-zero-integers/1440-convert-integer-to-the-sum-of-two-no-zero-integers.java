class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=0,b=0;
        for(int i=1;i<n;i++){

            int j=n-i;

            if(isValid(i) && isValid(j)){
                a=i;b=j;
                break;
            }
        }
        return new int[] {a,b};
    }

    private boolean isValid(int n){
        
        while(n>0){
            if(n%10==0){
                return false;
            }
            n/=10;
        }

        return true;
    }
}