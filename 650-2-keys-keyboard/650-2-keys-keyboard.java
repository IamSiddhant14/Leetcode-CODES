class Solution {
    public int minSteps(int n) {
        
        if( n == 1 ){
          return 0;
        }
        
        long[][] dp = new long[2*n+1][2*n+1];
        
        for( int i = 0; i<dp.length ; i++ ){
             for( int j = 0 ; j<dp.length ; j++ ){
                dp[i][j] = -1;
             }
        }
        
        return (int)(help( 1 , 1 , n , dp )+1l);
        
    }
    
    public long help( int screen , int buffer, long dest , long[][] dp ){
        
        if(screen == dest) return 0;
        if(screen > dest) return Integer.MAX_VALUE;
        
        if( dp[screen][buffer] !=- 1) return dp[screen][buffer];
        
        long copyPaste = 2l + help( 2*screen , screen , dest , dp );
        long paste = 1l+ help( screen+buffer , buffer , dest , dp );
        
        return dp[screen][buffer] = Math.min( copyPaste , paste );
        
        
    }
}