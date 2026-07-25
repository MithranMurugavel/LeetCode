class Solution {

    public int maxProduct(int n) {

        String s = Integer.toString(n);

        int max1 =0;
        int max2 = 0;

        for(int i=0;i<s.length();i++){
            int val = s.charAt(i) - '0';

            if(max1 < val){
                max2=max1;
                max1=val;
            }

            else if(max2<val){
                max2=val;
            }
        }

        return max1 * max2;
    }
}