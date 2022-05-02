class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp , -1);
        
        min(0 , cost , dp);
        return Math.min( dp[0] , dp[1]);
        
    }
    
    public int min(int n , int[] cost , int[] dp ){
        
        if( n >= cost.length ) return 0;
        
        if( dp[n] != -1 ) return dp[n];
        
        int v1 = min( n+1 , cost , dp );
        int v2 = min( n+2 , cost , dp );
        
        int ans = Math.min(v1,v2) + cost[n];
        
        dp[n] = ans;
        
        return ans;
        
        
        
        

    
    }
}