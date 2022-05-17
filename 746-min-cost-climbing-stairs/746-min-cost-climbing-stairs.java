class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length+1];
        Arrays.fill( dp , -1);
        
        help( 0 , cost , dp );
        
        return Math.min( dp[0] , dp[1] );
        
    }
    
    public int help( int idx , int[] cost , int[] dp ){
        
        // if( idx == cost.length -1 ){
        //     return cost[idx];
        // }
        
        if( idx >= cost.length ){
            return 0;
        }
        
        if( dp[idx] != -1 ) return dp[idx];
        
        int a1 = ( idx+1 <= cost.length-1 ) ? help( idx+1 , cost , dp ) : 0;
        int a2 = ( idx+2 <= cost.length-1 ) ? help( idx+2 , cost , dp ) : 0;
        
        return dp[idx] = Math.min( a1 , a2)+cost[idx];
        
    }
}