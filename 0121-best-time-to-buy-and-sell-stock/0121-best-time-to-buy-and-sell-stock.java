class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = Integer.MAX_VALUE;
        for(int i=0; i<prices.length - 1; i++) {
            if(prices[i] < prices[i+1]) {
                curr = Math.min(curr, prices[i]);
                int currProfit = prices[i+1] - curr;
                max = Math.max(max, currProfit);
            }
        }
        return max;
    }
}