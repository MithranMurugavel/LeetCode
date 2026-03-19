class Solution {
    public int[] finalPrices(int[] prices) {
        
        int n = prices.length;
        int[] ans = Arrays.copyOf(prices,n);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i] >= prices[j]){
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return ans;
    }
}