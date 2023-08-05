public class apn88{
    public static int buyAndsellstock(int prices[]){
        int buyPrice = 1000;//Integer.MAX_VALUE;
        int MaxProfit = 0 ;
        int profit ;

        for(int i = 0 ; i<prices.length;i++){
            if(buyPrice<prices[i]){
                profit = prices[i] - buyPrice;
                MaxProfit = Math.max(MaxProfit, profit);       
            }
            else{
                buyPrice = prices[i];
                
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndsellstock(prices));
    }
}