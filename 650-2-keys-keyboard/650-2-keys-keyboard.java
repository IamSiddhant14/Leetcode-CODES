class Solution {
    public int minSteps(int n) {
        
         if( n == 1 ) return 0;
        
        long[][] dp = new long[2*n + 1][2*n + 1];
        
        for( int i = 0; i<dp.length ; i++){
            for( int j = 0; j<dp[0].length ; j++ ){
                dp[i][j] = -1;
            }
        }

        return (int)(ans( 1 , 1 , n , dp ) + 1l) ;
        
    }
    
    public long ans( int screen , int buffer , int dest , long[][] dp )
    {
        
        if( screen == dest ) return 0;
        
        if( screen > dest ) return Integer.MAX_VALUE;
        
        if( dp[screen][buffer]  != -1 ) return dp[screen][buffer] ;
        
        long copyPaste = 2l + ans( 2*screen , screen , dest , dp );
        long paste = 1l + ans( screen+buffer , buffer , dest , dp );
        
        dp[screen][buffer] = Math.min( copyPaste , paste ) ;
        
        return dp[screen][buffer];

    }
    
    
    
    
    
    
}