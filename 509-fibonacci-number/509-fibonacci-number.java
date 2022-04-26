class Solution {
    public int fib(int n) {
        // Repeated calls + bigger problem depends on the smaller problem
        
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        
        int ans = getAns(n , dp);
        return ans;
    }
    
    public int getAns(int n , int[] dp){
        
        if( n == 0) return 0;
        if( n == 1) return 1;
        
        if( dp[n] != -1 ) return dp[n];
        
        int a1 = getAns(n-1, dp);
        int a2 = getAns(n-2, dp);
        
        dp[n] = a1+a2;
        
        return a1+a2;
      
    }
}