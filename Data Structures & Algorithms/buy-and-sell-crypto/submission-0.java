class Solution {
    public int maxProfit(int[] prices) {
        int[] smallest = new int[prices.length];
        
        smallest[0] = prices[0];

        for (int i=1;i<prices.length;i++) {
            smallest[i] = Math.min(smallest[i-1], prices[i]);
        }

        int res = 0;
        for (int i=0;i<prices.length;i++) {
            res = Math.max(prices[i] - smallest[i], res);
        }

        return res;
    }
}
