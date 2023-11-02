/*
 * Buy and Sell a stok: you are given an array of prices, where prices[i] is the price of that stock on that 'i'th day.
 * You need to buy a stock and then sell it when it gives you maximum profit. 
 * You can't sell a stock before you buy it
 */

/*
 * Approach : We can achieve maximum proift when the buying price will be minimum and the selling price will be maximum
 *      1. assign first element as minimum, and maxProfit is 0
 *      2. run a loop 
 *          a. calculate profit [profit = a[i] - minimum]
 *          b. calculate maxprofit by comparing between profit and maxprofit
 *          c. update the minimum by comapring it with current a[i]
 *      3. return maxprofit
 */

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 4, 3, 6, 9, 2 };
        int n = prices.length;

        int maxProfit = calculateMaxProfit(prices, n);
        System.out.println("The maximum profit we can achieve is: " + maxProfit);
    }

    public static int calculateMaxProfit(int[] arr, int n) {
        int maxProfit = 0;
        int minimumCost = arr[0];
        for (int i = 1; i < n; i++) {
            int profit = arr[i] - minimumCost;
            maxProfit = Math.max(maxProfit, profit);
            minimumCost = Math.min(minimumCost, arr[i]);
        }
        return maxProfit;
    }
}
