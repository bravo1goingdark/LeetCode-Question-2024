public class buySellStockIII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;
        
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);              // the maximum money we could have after buying the 1st stock
            sell1 = Math.max(sell1, buy1 + price);      // the maximum profit we could have after selling the 1st stock
            buy2 = Math.max(buy2, sell1 - price);       // the maximum money we could have after buying the 2nd stock
            sell2 = Math.max(sell2, buy2 + price);      // the maximum profit we could have after selling the 2nd stock
        }
        
        return sell2;
    }
}
