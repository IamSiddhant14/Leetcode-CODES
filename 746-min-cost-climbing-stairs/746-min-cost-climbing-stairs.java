class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if( cost.length == 0 ) return 0;
        
        int[] dp = new int[cost.length+1];
        Arrays.fill( dp , -1 );
        
        ans( 0 , cost , dp );
        return Math.min( dp[0] , dp[1]);
    }
    
    public int ans( int idx , int[] cost , int[] dp ){
        
        if( idx >= cost.length ){
            return Integer.MAX_VALUE;
        }
        
        if( dp[idx] != -1 ) return dp[idx];
        
        int a1 = (idx+1 <= cost.length-1) ? ans( idx+1 , cost , dp ) :0;
        int a2 = (idx+2 <= cost.length-1) ? ans( idx+2 , cost , dp ) :0;
        
        dp[idx] = Math.min( a1 , a2 ) + cost[idx];
        return dp[idx];
    
    }
}