class Solution {
   
    public int maxProfit(int[] prices) {
         int profit=0;
    int max=Integer.MIN_VALUE;
        int size=prices.length;
        int auxArray[]=new int[size];
        auxArray[size-1]=prices[size-1];
        for(int i=size-2;i>=0;i--){
           auxArray[i]=Math.max(auxArray[i+1],prices[i]);
        }
         for(int j=0;j<size;j++){
                 profit=auxArray[j]-prices[j];
             max=Math.max(max,profit);
                 
            }
        return max;
    }
}