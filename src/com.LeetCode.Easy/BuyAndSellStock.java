import java.util.Arrays;


public class BuyAndSellStock {

public static void main(String[] args) {
		
		
		
		
	BuyAndSellStock newTestingClass = new BuyAndSellStock();

//		int[] prices = {7,1,5,3,6,4};
		
//		int[] prices = {7,6,4,3,1};

		
		int[] prices = {1, 2,3,4,5};


		int value = newTestingClass.maxProfit(prices);
		
		System.out.println(value);
	}

	
    int profit = 0;

    boolean isAlreadyBought = false;
    
    public int maxProfit(int[] prices) {
        
        buyAndSell(prices );
        
            
        return profit;
    }
    
    public void buyAndSell(int[] prices) 
    {
        int buyValue = 0;
        int sellValue = 0;
        int i=0;
        if(!isAlreadyBought)
        {
           while(i+1 < prices.length && prices[i] > prices[i+1])
           {

               i++;
           }
            isAlreadyBought = true;
                buyValue = prices[i];
        }
        if(isAlreadyBought)
        {
            while(i+1 < prices.length && prices[i] < prices[i+1])
           {

               i++;
           }
            isAlreadyBought = false;
            	sellValue = prices[i];

            profit = profit + (  sellValue - buyValue);
        }
        if(i>= prices.length-1)
        	return ;
        buyAndSell(Arrays.copyOfRange(prices, i+1, prices.length));
    }
}