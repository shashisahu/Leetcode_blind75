class Solution {
    public int maxProfit(int[] prices) {
        //current price – lowest price seen so far
        int minBuy = Integer.MAX_VALUE;
        int maxProf = Integer.MIN_VALUE;
        for(int i =0; i< prices.length; i++){
            minBuy = Math.min(minBuy, prices[i]);
            maxProf = Math.max(maxProf , prices[i] - minBuy);

        }
        return maxProf;
    }
}
