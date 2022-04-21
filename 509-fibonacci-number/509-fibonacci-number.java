class Solution {
    
    public int fi( int n , int[] dp){
 
        if( n == 0) return 0;
        if( n == 1) return 1;
        
        if( dp[n] != -1 ) return dp[n];
        
        int a1 = fi( n-1 , dp );
        int a2 = fi( n-2 , dp );
        
        int ans = a1 + a2;
        
        dp[n] =ans;
        return ans;
    }
        
    public int fib(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill( dp , -1 );
        
        return fi( n , dp);
        
    }
}