class Solution {
    public int rob(int[] nums) {
        
        if( nums.length == 1 ){
            return nums[0];
        }
        
        if( nums.length == 0 ){
            return 0;
        }
        
        return Math.max( ro( nums , 0 , nums.length-2) ,  ro( nums , 1 , nums.length-1));   
    }
    
    public int ro( int[] nums , int start , int end  ){
        
        int[][] dp = new int[nums.length][2];
        
        for( int i = 0 ; i< nums.length ; i++ ){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        
        return ans( nums , dp , start , 0 , end );
        
    }
    
    public int ans( int[] nums , int[][] dp , int start , int prev , int end ){
        
        if( start == end+1 ) return 0;
        
        if( dp[start][prev] != -1 ) return dp[start][prev];
        
        int a1 = (prev == 0 ) ? ans( nums , dp , start+1 , 1 , end )+ nums[start] : 0 ;
        int a2 = ans( nums , dp , start+1 , 0 , end) ;
        
        dp[start][prev] = Math.max( a1 , a2 );
        
        return dp[start][prev];
    }
}