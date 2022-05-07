class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length+1];
        Arrays.fill( dp , -1 );
        
        help( 0 , cost , dp );
        
        return Math.min( dp[0] , dp[1] );
    }
    
    public int help (int n , int[] cost , int[] dp  ){
        
//         if( n == cost.length-1 ){
//            return cost[n];
//         }
        
        if( n >= cost.length ){
           return 0;
        }
        
        if( dp[n] != -1 ) return dp[n];
        
        int a1 = ( n+1 <= cost.length - 1 ) ? help( n+1 , cost , dp ) : 0;
        int a2 = ( n+2 <= cost.length - 1 ) ? help( n+2 , cost , dp ) : 0;
        
        return dp[n] = Math.min( a1 , a2 ) + cost[n];

    }
}