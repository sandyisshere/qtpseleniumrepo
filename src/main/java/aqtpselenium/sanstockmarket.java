package aqtpselenium;

import org.testng.annotations.Test;


public class sanstockmarket {

	@Test
	public void teststockmarket()
	{
		
		int[] ival= {10,5,2,25,30,40};
		System.out.println(maxProfit2(ival));
		
	}
	
	public int maxProfit(int[] prices) {
		int max = 0;
		int minPrice = Integer.MAX_VALUE;
		/**
		 * just update the min value, if there's a larger profit, the sell value
		 * must show later.
		 */
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
				continue;
			}
			if (prices[i] - minPrice > max) {
				max = prices[i] - minPrice;
			}
		}
		return max;
	}
	
	
	public int maxProfit2(int[] prices) {
		/**the current on hold price**/
        int min = Integer.MAX_VALUE;
        /**total profit**/
        int total=0;
        
        for(int i=0;i<prices.length;i++){
        	/**
        	 * if the current price is smaller than hold price,
        	 * change it to the smaller one
        	 */
            if(prices[i]<min){
                min=prices[i];
                continue;
            }
            /**
             * if current price is larger than hold one,
             * just sell the hold one, so profit is prices[i]-min
             * and make hold value as current price
             * (if in the next day, we see a smaller value, then change it,
             * 	otherwise, sell it again)
             */
            if(prices[i]>min){
                total+=prices[i]-min;
                min=prices[i];
            }
        }
        return total;
        
    }
	
}
