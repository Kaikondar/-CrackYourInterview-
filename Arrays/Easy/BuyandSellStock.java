class Solution {
      public int maxProfit(int[] prices) {
          int min=Integer.MAX_VALUE;
          int maxprofit=0;
          for(int i:prices){
              min=Math.min(i,min);
              maxprofit=Math.max(maxprofit,i-min);
          }
          return maxprofit;
      }
  }