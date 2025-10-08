package dsapractice.array;

public class BuyAndSellStocks {
    private static int buyAndSellStocks(int prices[]) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);

            }
            buyPrice = Math.min(prices[i], buyPrice);

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit is: " + buyAndSellStocks(prices));
    }
}
