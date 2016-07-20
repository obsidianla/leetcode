// set two node, fast and slow, if fast catches up slow, then there exists a loop


public int maxProfit(int[] prices) {
        if(prices.length == 0 ||prices.length == 1)
            return 0;
        
        int profit = 0;
        int minPrice = prices[0];
            
        for(int i = 0; i <prices.length;i++) {
            
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(prices[i] - minPrice, profit);
        }
        return profit;
    }
