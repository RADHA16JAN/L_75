class Solution {
    public int maxProfit(int[] prices) {
       int m=prices.length;
       int max=0;   //profit  in 1 day
       int p=0;   // total profit
       int bp=Integer.MAX_VALUE;  //bp is buy prices
       for(int i=0;i<m;i++){
       if(prices[i]<bp){
           bp=prices[i];
       }
       max=prices[i]-bp;
       if(p<max){
           p=max;
       }
       }
       return p; 
   
}
}
