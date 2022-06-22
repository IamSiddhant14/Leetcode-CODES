class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length+1];
        
        Arrays.fill( dp , -1 );
        
        ans( dp , cost , 0 );
        return Math.min( dp[0] , dp[1]);
    }
    
    int ans( int[] dp , int[] cost , int idx ){
        
        if( idx >= cost.length  ){
            return Integer.MAX_VALUE;
        }
        
        if( dp[idx] != -1 ) return dp[idx];
        
        int a1 = (idx+1 <= cost.length-1 ) ? ans( dp , cost , idx+1) : 0 ;
        int a2 = (idx+2 <= cost.length-1 ) ? ans( dp , cost , idx+2) : 0 ;
        
        return dp[idx] = Math.min( a1 , a2 )+ cost[idx];
    }
}