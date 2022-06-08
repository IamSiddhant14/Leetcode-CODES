class Solution {
    public int rob(int[] nums) {
        
        int[][] dp = new int[nums.length+1][2];
        
        for( int i = 0; i<dp.length ; i++ ){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        
        return ans( nums , dp , 0  , 0);
        
        
    }
    
    public int ans( int[] nums , int[][] dp , int prev , int idx ){
        
        if( idx == nums.length ){
            return 0;
        }
        
        if( dp[idx][prev] != -1 )  return dp[idx][prev];
                                                  
        int a1 = ( prev == 0 ) ? ans( nums , dp , 1 , idx+1 )+ nums[idx] : Integer.MIN_VALUE;
        int a2 = ans( nums , dp , 0 , idx+1 ) ;
                                                  
        dp[idx][prev] = Math.max( a1 , a2 );
        return dp[idx][prev] ;
                                                  
    }
}