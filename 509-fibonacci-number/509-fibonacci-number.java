class Solution {
    public int fib(int n) {
        // Repeated calls + bigger problem depends on the smaller problem
        
        int[] dp = new int[n+1];
        
        int ans = getAns(n , dp);
        return ans;
    }
    
    public int getAns(int n , int[] dp){
        
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;
        
        dp[0] = 0;
        dp[1] = 1;
        
        for( int i = 2; i< dp.length ; i++ ){
              dp[i] = dp[i-1] + dp[i-2];
        }
      
        return dp[n];
    }
}