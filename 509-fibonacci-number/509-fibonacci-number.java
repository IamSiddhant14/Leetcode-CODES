class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill( dp , -1);
        
        return fibAns( n , dp );
    }
    
    public int fibAns( int n , int[] dp ){
       
        if( n == 0 ){
           return 0; 
        }
        
        if( n == 1 ){
            return 1; 
        }
        
        if ( dp[n] != -1 ){
            return dp[n];
        }
        
        int n1 = fibAns( n-1 , dp );
        int n2 = fibAns( n-2 , dp );
        
        dp[n] = n1+n2;
        
        return n1+n2;
    }
}