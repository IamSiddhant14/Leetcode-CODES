class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill( dp , -1 );
        
        return ans( n , dp );
        
    }
    
    int ans( int n , int[] dp ){
        
        if( n == 0){
            return 1;
        }
        
        if( n < 0 ){
            return 0;
        }
        
        if( dp[n] != -1 ) return dp[n];
        
        int a1 = ans( n-1 , dp );
        int a2 = ans( n-2 , dp );
        
        dp[n] = a1+a2;
        
        return dp[n];
        
    }
    
}
