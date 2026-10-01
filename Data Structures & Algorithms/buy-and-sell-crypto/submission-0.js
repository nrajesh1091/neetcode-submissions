class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let r = 1;
        let l = 0;
        let output = 0;
        while (l < r && r < prices.length) {
            if (prices[r] <= prices[l]) {
                l = r;
            } else {
                let cal = prices[r] - prices[l];
                output = Math.max(cal, output);
            }
            r++;
        }
        return output;
    }
}
