class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if( cost.length == 0 ){
            return 0;
        }
        
        if( cost.length == 1 ){
            return cost[0];
        }
        
        int[] dp = new int[cost.length+1];
        Arrays.fill( dp , -1 );
        
        ans( cost , dp , 0);
        return Math.min( dp[0] , dp[1] );
        
    }
    
    int ans( int[] cost , int[] dp , int idx ){
       
        if( idx >= cost.length ){
            return 0;
        }
        
        if( dp[idx] != -1 ) return dp[idx];
        
        int a1 = ans( cost , dp , idx+1 );
        int a2 = ans( cost , dp , idx+2 );
        
        return dp[idx] = Math.min(a1 , a2) + cost[idx] ;
        
    }
    
    
}