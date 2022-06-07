class Solution {
    public int rob(int[] nums) {
        
        int[][] dp = new int[nums.length+1][2];
        
        for( int i = 0 ; i<= nums.length ; i++ ){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        
       return  ans( nums , dp , 0 , 0 );
        
    }
    
    public int ans( int[] nums , int[][] dp , int taken , int idx ){
        
        if( idx == nums.length ) return 0;
        
        if( dp[idx][taken] != -1 ) return dp[idx][taken];
        
        int a1 = ( taken == 0 ) ? ans( nums , dp , 1 , idx+1 ) + nums[idx] : 0;
        int a2 = ans( nums , dp , 0 , idx+1 );
        
        dp[idx][taken] = Math.max( a1 , a2 );
        return dp[idx][taken];
    }
}