class Solution {
    public int reverse(int x) {
        
        int n=x;
        //if(x==-1563847412) return 0;
        if(x<0){
            x=~x+1;
        }
        long sum=0;

        while(x>0){
            int r=x%10;
            sum=sum*10+r;
            x/=10;
        }

        if(n>0  && sum>=Integer.MAX_VALUE){
            return 0;
        }else if(n>0  && !(sum>Integer.MAX_VALUE))return (int) sum;
        else if(n<0  && (sum<Integer.MAX_VALUE))return (int) ~sum+1;;
        return 0;
    }
}