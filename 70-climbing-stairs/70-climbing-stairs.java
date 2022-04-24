class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill( dp , -1);
        
        return getAns( 0 , dp );
        
    }
    
    public int getAns( int n , int[] dp ){
        
        if( n == dp.length-1 ){
            return 1;
        }
        
        int ans = 0;
        if( dp[n] != -1 ) return dp[n];
        
        for( int i =1 ; i<= 2 ; i++ ){
            if( n+i <= dp.length-1 ){
                ans += getAns( n+i , dp);
            }
        }
        
        dp[n] = ans;
        return ans;

    }
}