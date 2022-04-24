class Solution {
    public int fib(int n) {
         
        if( n == 0) return 0;
        if( n == 1) return 1;
        
        // int[] dp = new int[n+1];
        
        // dp[0] = 0; dp[1] = 1;
        int prev = 0;
        int curr = 1;
        int forward = 0;
        
        for( int i =2; i<=n ; i++ ){
             forward = curr + prev;
             prev = curr;
             curr = forward;
        }
        
        return curr ;
        
    }
    
}