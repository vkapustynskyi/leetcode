
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};

        int k = maxProfit(nums);
        System.out.println(k);
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
