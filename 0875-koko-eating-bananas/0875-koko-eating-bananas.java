class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l=1,r=1;

        for(int n:piles){
            r=Math.max(r,n);

        }

        while(l<r){
            int mid = l + (r-l) / 2;
            if(finish(piles,mid,h)){
                r = mid;
            }

            else{
                l = mid+1;
            }

        }

        return l;
    }

    private boolean finish(int[] piles, int mid, int h){
        int hrs = 0;

        for(int i:piles){
            hrs += Math.ceil((double) i/mid);
        }

        return hrs <= h;
    }
}