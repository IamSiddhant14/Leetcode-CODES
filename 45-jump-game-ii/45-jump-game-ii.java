class Solution {
    public int jump(int[] nums) {
        
        long [] dp = new long[nums.length + 1];
        Arrays.fill( dp , -1 );
        
        return (int)(help( 0 ,nums , dp ));
        
    }
    
    public static long help( int n , int[] nums , long[] dp ){
        
        if( n == nums.length-1 ){
            return 0;
        }
        
        long ans = Integer.MAX_VALUE;
        
        if( dp[n] != -1 ) return dp[n];
        
        for( int i = 1; i<= nums[n] ; i++ ){
            
            if( n + i <= nums.length-1 ){
                 ans = Math.min( ans , help( n+i , nums , dp)+1 );
            }  
        }
        
        return dp[n] = ans;
    }
}