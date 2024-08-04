class Solution {
    public int maxProfit(int[] prices) {
        int buyday = 0;
        int profit = 0;
        
        for(int i=1; i< prices.length;i++){
            if(prices[buyday] > prices[i]){
                buyday = i;
            }else{
                int temp = prices[i] - prices[buyday];
                if(temp > profit){
                    profit = temp;
                }
            }
            
        }
        
        return profit;
    }
}