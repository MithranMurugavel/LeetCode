class Solution {
    public int maxArea(int[] h) {
        
        int l=0,r=h.length-1;

        int area=Integer.MIN_VALUE;

        while(l<r){
            int a = Math.min(h[l],h[r]) * (r-l);

            if(area<a) area = a;

            if(h[l]< h[r]) l++;

            else  r--;
           

        }

        return area;
    }
}