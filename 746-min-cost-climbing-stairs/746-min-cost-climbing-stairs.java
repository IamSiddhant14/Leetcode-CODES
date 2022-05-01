class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length+1];
        Arrays.fill( dp , -1);
        minCost( cost , 0 , dp);
        return Math.min( dp[0] , dp[1]);
        
    }
    
    public int minCost(int[] cost,int n , int[] dp ){
        
        if( n >= cost.length ) return 0;
        
        if( dp[n] != -1 ) return dp[n];
        
        int v1 = minCost( cost , n+1 , dp);
        int v2 = minCost( cost , n+2 , dp);
        
        dp[n] = Math.min(v1,v2)+ cost[n];
        
        return dp[n];
    }
    
}