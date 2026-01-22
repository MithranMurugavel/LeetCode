class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 1) return 0;
        int max = Integer.MIN_VALUE;
        int curr = prices[0];
        for(int i=1;i<prices.length;i++){
                
                curr = Math.min(curr,prices[i]);
                max = Math.max(max,prices[i] - curr);
        }

        return max;
    }
}