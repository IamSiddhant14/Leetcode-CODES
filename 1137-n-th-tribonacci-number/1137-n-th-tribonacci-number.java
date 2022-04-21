class Solution {
    
    public int tri( int n , int[] dp ){
        
        if( n <= 1 )return n;
        if( n == 2 )return 1;
        
        if( dp[n] != -1 )return dp[n];
        
        int a1 = tri( n-1 , dp );
        int a2 = tri( n-2 , dp );
        int a3 = tri( n-3 , dp );
        
        dp[n] = a1 + a2 + a3;
        return  a1 + a2 + a3;
        
    }
    
    public int tribonacci (int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        
        int ans = tri( n , dp );
        return ans;
        
        
        
    }
}