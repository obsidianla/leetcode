if prices is None or len(prices)<=1:
            return 0
        minPrice=prices[0]
        profit=0
        for i in prices:
            minPrice = min(minPrice, i)
            profit=max(i-minPrice, profit)
        return profit
