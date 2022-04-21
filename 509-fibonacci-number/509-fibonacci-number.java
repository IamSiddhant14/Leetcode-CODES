class Solution {
    
    public int[] fi( int n , int[] dp ){
        
        for( int i =2 ; i<dp.length ;i++ ){
             dp[i] = dp[i-1] + dp[i-2];
        }

        return dp;
    }
    
    public int fib(int n) {
        
        if( n == 0 )return 0;
        if( n == 1 )return 1;
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        
        dp[1] = 1;
        int[] ans = fi( n , dp );
        
        return ans[n];
        
        
    }
}