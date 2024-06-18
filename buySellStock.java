public class buySellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        
        for(int i = 0; i < prices.length ; i++){
            if(start < prices[i]){
                max += prices[i] - start;
            }
            start = prices[i];
        }
        return max;
    }
}