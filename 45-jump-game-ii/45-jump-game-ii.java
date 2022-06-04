class Solution {
    public int jump(int[] nums) {
        
        if( nums.length == 1 )return 0;
        
        
        long[] dp = new long[nums.length+1];
        Arrays.fill( dp , -1 );
        
        ansA( nums , dp , 0 );
        return (int)dp[0];

    }
    
    public long ansA ( int[] nums , long[] dp , int j){
        
        if( j >= nums.length-1 ){
            return 0;
        }
        
        if( dp[j] != -1 ) return dp[j];
        long ans = Integer.MAX_VALUE;
        
        for( int i = 1; i <= nums[j] ; i++ ){
            
            if( j+i <= nums.length-1 ){
               ans = Math.min( ans , ansA( nums , dp , j+i ) + 1l);
            }
            
        } 
        
        dp[j] = ans;
        
        return dp[j] ;
        
    }
}