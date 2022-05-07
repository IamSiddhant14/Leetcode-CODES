class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length+1] ;
        Arrays.fill( dp , Integer.MAX_VALUE );
        
        int a1 = help( 0 , cost , dp );
        int a2 = help( 1 , cost , dp );
        
        return Math.min( a1 , a2 );
        
    }
    
    public int help( int n , int[] cost , int[] dp ){
        if(n > cost.length){
            return Integer.MAX_VALUE;
        }
        if( n == cost.length ) return 0 ;
        
        if( dp[n] != Integer.MAX_VALUE ) return dp[n];
        
        int a1 = help( n+1 , cost , dp );
        int a2 = help( n+2 , cost , dp );
        if(a1 == Integer.MAX_VALUE && a2 == Integer.MAX_VALUE){
            return dp[n] = Integer.MAX_VALUE;
        }
        return dp[n] = Math.min(a1 , a2)+ cost[n];
    }
}