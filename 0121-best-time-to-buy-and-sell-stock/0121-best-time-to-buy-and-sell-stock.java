class Solution {
    public int maxProfit(int[] prices) {
        //need to find min and then max 
        int min = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int n:prices){
          min = Math.min(min, n);
          maxProfit = Math.max(maxProfit, n-min);
        }
        return maxProfit;
    }
}