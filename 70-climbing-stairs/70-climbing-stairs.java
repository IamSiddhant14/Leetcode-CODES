class Solution {
    
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        
        Arrays.fill( dp , -1 );
        ans( n , dp );
        
        return dp[n];
        
    }
    
     public int ans( int n , int[] dp ) {
         
        if( n == 0 ){
            return 1;
        }
        if( dp[n] != -1 ) return dp[n];
         
        int a1 = ( n-1 >= 0 ) ? ans( n-1 , dp ) : 0;
        int a2 = ( n-2 >= 0 ) ? ans( n-2 , dp ) : 0;
        
        return dp[n] = a1+a2;
    
     }
}