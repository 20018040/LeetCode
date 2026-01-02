class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int profit = 0;
        for(int i = 1; i< prices.length; i++){
            int price = prices[i];
            if(price < lowest ){
                lowest = price; 
            }
            else if ( price - lowest > profit){
                profit = price - lowest; 
            }
            
        }
        return profit;
    }
}