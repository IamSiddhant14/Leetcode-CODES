class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        long[] dp = new long[n+1];
        Arrays.fill( dp , -1);
        
        return getAns( 0 , dp , nums );
        
    }
    
    public int getAns( int n , long[] dp , int[] nums ){
        
        if( n == nums.length -1 ){
             return 0;
        }
         
        long ans = (long)(1e9);
        
        if( dp[n] != -1 ) return (int)(dp[n]);
        
        for( int i = 1; i<= nums[n] ; i++ ){
            
            if( n+i <= nums.length-1 ){
                  ans = Math.min(ans , getAns(n+i , dp , nums)+1 );
            }

        }
        
        dp[n] = (int)(ans);
        return (int)(ans);
                  
    }
}